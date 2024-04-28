package com.example.cinemate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboard1 : AppCompatActivity() {

    lateinit var button: Button;
    lateinit var button1: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard1)

        button = findViewById(R.id.next1)

        button.setOnClickListener {
            val intent = Intent(this, onboard2::class.java)
            startActivity(intent)
        }

        button1 = findViewById(R.id.skip1)

        button1.setOnClickListener {
            val intent = Intent(this, onboard2::class.java)
            startActivity(intent)
        }


    }
}