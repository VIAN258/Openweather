package com.example.colorweather.data.model

 class Current (
    val dt: Int,
    val sunrise: Long,
    val sunset: Double,
    val temp: Double,
    val feelsLike: Double,
    val pressure: Double,
    val humidity: Long,
    val dewPoint: Double,
    val uvi: Double,
    val clouds: Long,
    val visibility: Long,
    val windSpeed: Double,
    val windDeg: Long,
    val weather: List<Weather>
)




