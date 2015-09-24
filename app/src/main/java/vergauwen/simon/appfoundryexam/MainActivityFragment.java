package vergauwen.simon.appfoundryexam;

import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ListAdapter listAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        listAdapter = new ListAdapter(getActivity());

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(listAdapter);

        FetchWeatherData fetchWeatherData = new FetchWeatherData();
        fetchWeatherData.execute();

        return rootView;
    }


    private class FetchWeatherData extends AsyncTask<Void, Void, String[][]> {
        private final String LOG_TAG = FetchWeatherData.class.getSimpleName();

        @Override
        protected String[][] doInBackground(Void... params) {
            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;
            String weatherJSONStr = null;

            try {
                //https://api.forecast.io/forecast/874523164b30ce0ddfb907e6bf2f44a3/51.2298180,4.5108970
                final String MOVIE_BASE_URL = "api.forecast.io";
                final String TOKEN = "874523164b30ce0ddfb907e6bf2f44a3";
                final String LATITUDE = "51.2298180";
                final String LONGITUDE = "4.5108970";


                Uri.Builder builder = new Uri.Builder();
                        builder.scheme("https")
                                .authority(MOVIE_BASE_URL)
                                .appendPath("forecast")
                                .appendPath(TOKEN)
                                .appendPath(LATITUDE + "," + LONGITUDE);


                URL url = new URL(builder.build().toString().replace("%2C", ","));
                Log.v(LOG_TAG, url.toString());

                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                // Read the input stream into a String
                InputStream inputStream = urlConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();

                if (inputStream == null) {
                    // Nothing to do.
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));

                String line;
                while ((line = reader.readLine()) != null) {
                    //End line to create a formatted JSON LOG for debugging.
                    buffer.append(line + "\n");
                }

                if (buffer.length() == 0) {
                    // Stream was empty.  No point in parsing.
                    return null;
                }
                weatherJSONStr = buffer.toString();

                Log.v(LOG_TAG, "Weather JSON String" + weatherJSONStr);

            } catch (Exception e) {
                    Log.e(LOG_TAG,e.toString());
            } finally {
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }


                if (reader != null) {
                    try {
                        reader.close();
                    } catch (final IOException e) {
                        Log.e(LOG_TAG, "Error closing stream", e);
                    }
                }

            }

            try {
                return getDataFromWeather(weatherJSONStr);
            } catch (JSONException e) {
                Log.e(LOG_TAG, e.getMessage(), e);
                e.printStackTrace();
            }

            return null;
        }

        private String[][] getDataFromWeather(String weatherJSONStr) throws JSONException {
            // These are the names of the JSON objects that need to be extracted.
            final String[] WEATHER_DETAILS = {"time", "summary", "temperature"};
            JSONArray dataJSONArray;
            JSONObject weatherJSONObject, hourlyJSONObject;
            String[][] resultStrs;

                    weatherJSONObject = new JSONObject(weatherJSONStr);
                    hourlyJSONObject = weatherJSONObject.getJSONObject("hourly");
                    dataJSONArray = hourlyJSONObject.getJSONArray("data");

                    resultStrs = new String[dataJSONArray.length()][WEATHER_DETAILS.length];
                    for(int i = 0; i < dataJSONArray.length(); i++) {
                        JSONObject weatherDetails = dataJSONArray.getJSONObject(i);
                        for(int j = 0; j < WEATHER_DETAILS.length; j++){
                            resultStrs[i][j] = weatherDetails.getString(WEATHER_DETAILS[j]);
                        }
                    }

                    //FOR DEBUGGING
                    String debugSTR = "";
                    for(int i = 0; i < dataJSONArray.length(); i++) {
                        for(int j = 0; j < WEATHER_DETAILS.length; j++){
                            debugSTR += resultStrs[i][j] + " ";
                        }
                        Log.v(LOG_TAG, "WEATHER DETAIL DEBUG STRING: " + debugSTR);
                        debugSTR = "";
                    }
            return resultStrs;
        }

        protected void onPostExecute(String[][] result) {
            if(result != null){
                listAdapter.clear();
                listAdapter.add(result);
                listAdapter.notifyDataSetChanged();
            }
        }
    }
}
