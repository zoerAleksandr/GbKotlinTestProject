package com.example.gbkotlintestproject.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.gbkotlintestproject.R
import com.example.gbkotlintestproject.data.Weather
import com.google.android.material.textview.MaterialTextView

class WeatherViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val town = itemView.findViewById<MaterialTextView>(R.id.city_name)
    private val temperature = itemView.findViewById<MaterialTextView>(R.id.temperature_now)

    fun bind(weather: Weather) {
        town.text = weather.town
        temperature.text = weather.temperature.toString()
    }

}