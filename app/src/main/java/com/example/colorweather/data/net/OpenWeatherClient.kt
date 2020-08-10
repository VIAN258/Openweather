package com.example.colorweather.data.net

import com.example.colorweather.data.model.WeatherClass
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object OpenWeatherClient {

    private val openWeatherMapApi: OpenWeatherMapApi

    private const val  appid = "85250688daa132c1a60771a8d028e6cf"
    private const val  OPEN_WEATHER_URL = "https://api.openweathermap.org/"
    private  val coordinates = Pair("20","80")



    init{
        val builder = OkHttpClient.Builder()
        val okHttpClient = builder.build()
        val retrofit= Retrofit.Builder()
            .baseUrl(OPEN_WEATHER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        openWeatherMapApi = retrofit.create(OpenWeatherMapApi::class.java)

    }
    fun getWeather(lat: String = coordinates.first, lon: String = coordinates.second): Call<WeatherClass>{

        return openWeatherMapApi.getWeather(appid, lat, lon)
    }


}