package com.example.cinemate

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navbar_view)
        bottomNavigationView.selectedItemId = R.id.bottom_profile

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

                R.id.bottom_location -> {
                    startActivity(Intent(applicationContext, Location::class.java))
                    overridePendingTransition(R.anim.side_in_right, R.anim.side_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_profile-> return@setOnItemSelectedListener true
            }
            false
        }
    }
}