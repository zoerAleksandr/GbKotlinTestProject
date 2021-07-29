package com.example.gbkotlintestproject.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gbkotlintestproject.R
import com.example.gbkotlintestproject.repository.IRepository

class WeatherAdapter(private val repository: IRepository) : RecyclerView.Adapter<WeatherViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return WeatherViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.bind(repository.getWeather()[position])
    }

    override fun getItemCount(): Int {
        return repository.getWeather().size
    }
}