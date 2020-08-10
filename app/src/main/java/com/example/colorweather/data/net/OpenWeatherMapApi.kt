package com.example.colorweather.data.net

import com.example.colorweather.data.model.WeatherClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface OpenWeatherMapApi {

    @GET("data/2.5/onecall/{lon},{lat}/{appid}")
    fun getWeather(
        @Query("lat")lat: String,
        @Query("lon")lon: String,
        @Query("appid")appid: String
        //@Query("units")units: String,
        //@Query("lang")lang: String
    ): Call<WeatherClass>
}