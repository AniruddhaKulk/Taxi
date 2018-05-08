package com.aniruddhakulkarni.taxi.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by aniruddhakulkarni on 08/05/18.
 */

public interface IGoogleAPI {

    @GET
    Call<String> getPath (@Url String url);
}
