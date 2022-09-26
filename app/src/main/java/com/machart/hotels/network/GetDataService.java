package com.machart.hotels.network;

import com.machart.hotels.model.Hotels;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataService {
//    @GET("list.php?lat={LATITUDE}&lon={LONGITUDE}")
    @GET("list.php")
    Call<ArrayList<Hotels>> getHotels(@Query("lat") double latitude, @Query("lon") double longitude);
}
