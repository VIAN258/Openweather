package com.example.colorweather.data.model

data class Daily (
    val dt: Long,
    val sunrise: Long,
    val sunset: Long,
    val temp: Temp,
    val feelsLike: FeelsLike,
    val pressure: Long,
    val humidity: Long,
    val dewPoint: Double,
    val windSpeed: Double,
    val windDeg: Long,
    val weather: List<Weather>,
    val clouds: Long,
    val pop: Long,
    val uvi: Double
)