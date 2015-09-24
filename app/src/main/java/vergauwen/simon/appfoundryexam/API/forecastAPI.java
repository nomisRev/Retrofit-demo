package vergauwen.simon.appfoundryexam.API;

import retrofit.Callback;
import retrofit.http.GET;
import vergauwen.simon.appfoundryexam.model.Weather;

/**
 * Created by Simon on 24/09/15.
 */
public interface forecastAPI {

    @GET("/forecast/874523164b30ce0ddfb907e6bf2f44a3/51.2298180,4.5108970")
    public void getFeed(Callback<Weather> response);
}
