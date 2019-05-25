package vn.tripi;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import vn.tripi.apimodels.SearchFlightOneDirection;

public interface BackEndAPI {

    @Headers({
            "login_token: 8ebc5e7a-3639-488c-9f90-cdabcaec1453",
            "User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.109 Safari/537.36",
            "sessionid: 1995fa84-8e41-47b3-9341-95de35a944e9",
            "deviceInfo: WebDesktop",
            "Content-Type: application/json"
    })
    @POST("flights/searchOneDirectionTickets")
    Call<ResponseBody> searchOneDirection(@Body SearchFlightOneDirection searchBody);
}
