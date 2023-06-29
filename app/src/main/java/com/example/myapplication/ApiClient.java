package com.example.myapplication;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private String BASE_URL ="https://medic.madskill.ru/api/";
    public ApiService apiService;

    public ApiService getApiService(Context context) {
        if(apiService==null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient(context))
                    .build();
            apiService = retrofit.create(ApiService.class);
        }
        return apiService;
    }

    private OkHttpClient okHttpClient(Context context) {
        return  new OkHttpClient.Builder()
                .addInterceptor(new Authenticator())
                .build();
    }
}
