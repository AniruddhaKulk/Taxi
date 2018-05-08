package com.aniruddhakulkarni.taxi.common;

import com.aniruddhakulkarni.taxi.remote.IGoogleAPI;
import com.aniruddhakulkarni.taxi.remote.RetrofitClient;

/**
 * Created by aniruddhakulkarni on 08/05/18.
 */

public class Common {

    public static final String baseUrl = "https://maps.googleapis.com";

    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseUrl).create(IGoogleAPI.class);
    }
}
