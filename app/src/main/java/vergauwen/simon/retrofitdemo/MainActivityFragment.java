package vergauwen.simon.retrofitdemo;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.List;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import vergauwen.simon.retrofitdemo.API.forecastAPI;
import vergauwen.simon.retrofitdemo.model.*;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ListAdapter listAdapter;
    private static final String ENDPOINT = "https://api.forecast.io";                         //BASE URL
    private Weather mWeather;
    private Hourly mHourly;
    private List<Datum> mData;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        listAdapter = new ListAdapter(getActivity());

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(listAdapter);

        getData();

        return rootView;
    }



    public void getData(){
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(ENDPOINT)
                .build();

        forecastAPI api = adapter.create(forecastAPI.class);

        api.getFeed(new Callback<Weather>() {
            @Override
            public void success(Weather weather, Response response) {
                mWeather = weather;
                mHourly = mWeather.getHourly();
                mData = mHourly.getData();

                listAdapter.add(mData);
                listAdapter.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e("ERROR IN RETROFIT", error.toString());
            }
        });

    }
}
