package com.example.gbkotlintestproject.repository

import com.example.gbkotlintestproject.data.Weather

object Repository : IRepository {
    private val weatherList: List<Weather> = listOf(
        Weather("Mосква", 19),
        Weather("Санкт-Петербург", 16),
        Weather("Мурманск", 5)
    )

    override fun getWeather(): List<Weather> {
        return weatherList
    }
}

interface IRepository {
    fun getWeather(): List<Weather>
}