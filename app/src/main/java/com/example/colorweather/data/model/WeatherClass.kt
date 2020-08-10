package com.example.colorweather.data.model


  class WeatherClass(
    val lat: Long,
    val lon: Long,
    val timezone: String,
    val timezoneOffset: Long,
    val current: Current,
    val hourly: List<Hourly>,
    val daily: List<Daily>

)
