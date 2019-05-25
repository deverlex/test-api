package vn.tripi;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class WsClient {

    private BackEndAPI backEndAPI;

    public WsClient() {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("http://localhost:9000/");
        builder.addConverterFactory(JacksonConverterFactory.create());
        Retrofit retrofit = builder.build();
        backEndAPI = retrofit.create(BackEndAPI.class);
    }

    public BackEndAPI getBackEndAPI() {
        return backEndAPI;
    }
}
