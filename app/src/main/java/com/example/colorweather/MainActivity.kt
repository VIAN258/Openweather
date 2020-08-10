package com.example.colorweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.colorweather.data.model.WeatherClass
import com.example.colorweather.data.net.OpenWeatherClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OpenWeatherClient.getWeather().enqueue(object : Callback<WeatherClass>{
            override fun onFailure(call: Call<WeatherClass>, t: Throwable) {
                Log.d("MainActivity", "Error")
            }

            override fun onResponse(call: Call<WeatherClass>, response: Response<WeatherClass>) {
                Log.d("MainActivity", "Exito") // With this i get a "Exito"
                Log.d("MainActivity", "${response.body()?.current?.pressure}") // With this i get null




            }

        })

    }
}