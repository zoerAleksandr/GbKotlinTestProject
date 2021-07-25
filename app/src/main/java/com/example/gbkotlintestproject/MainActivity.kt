package com.example.gbkotlintestproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        val cityName = findViewById<MaterialTextView>(R.id.city_name)
        cityName.text = "Москва"
        cityName.setOnClickListener {
            Toast.makeText(
                    this@MainActivity,
                    "Выбрать город",
                    Toast.LENGTH_SHORT
            ).show()
        }

        val temperatureNow = findViewById<MaterialTextView>(R.id.temperature_now)
        temperatureNow.text = "15"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.setting -> {
            Toast.makeText(
                    this@MainActivity,
                    "Settings",
                    Toast.LENGTH_SHORT
            ).show()
            true
        }

/*
* ВОПРОС!
* Не нашел как реализовать onOptionsItemSelected без else с super методом.
* Зачем он нужен и как работает?
* Возможна ли другая реализация?
* */
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}