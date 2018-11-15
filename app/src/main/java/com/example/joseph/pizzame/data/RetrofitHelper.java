package com.example.joseph.pizzame.data;

import android.util.Log;

import com.example.joseph.pizzame.model.SearchResult;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import static android.content.ContentValues.TAG;

/**
 * Created by joseph on 11/15/18.
 */

public class RetrofitHelper {

    public static final String BASE_URL = "https://query.yahooapis.com";

    static public Retrofit create(String url){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        return retrofit;
    }

    static public Observable<SearchResult> callYQL(Map<String, String> query){
        Retrofit retrofit = create(BASE_URL);
        RequestService service = retrofit.create(RequestService.class);
        Log.d(TAG, "callYQL: " + query);
        return service.yqlResponseService(query);
    }

    public interface RequestService {
        @GET("/v1/public/yql")
        Observable<SearchResult> yqlResponseService(@QueryMap Map<String, String> query);

        // https://query.yahooapis.com/v1/public/yql
        // ?q=select%20*%20from%20local.search(100)%20where%20latitude%3D'30.401885'%20and%20longitude%3D'-97.752316'%20and%20radius%3D50%20and%20query%3D'pizza'%20limit%2050%20offset%2045%20%7C%20sort(field%3D%22Distance%22%2C%20descending%3D%22false%22)
        // &format=json
        // &diagnostics=true
        // &callback=>

    }
}
