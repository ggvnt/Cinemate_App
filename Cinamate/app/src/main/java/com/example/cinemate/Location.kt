package com.example.cinemate

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_location)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navbar_view)
        bottomNavigationView.selectedItemId = R.id.bottom_location

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {


                R.id.bottom_home -> {
                    startActivity(Intent(applicationContext, Home::class.java))
                    overridePendingTransition(R.anim.side_in_right, R.anim.side_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_movie -> {
                    startActivity(Intent(applicationContext, Movies::class.java))
                    overridePendingTransition(R.anim.side_in_right, R.anim.side_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_location -> return@setOnItemSelectedListener true


                R.id.bottom_profile -> {
                    startActivity(Intent(applicationContext, Profile::class.java))
                    overridePendingTransition(R.anim.side_in_right, R.anim.side_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}