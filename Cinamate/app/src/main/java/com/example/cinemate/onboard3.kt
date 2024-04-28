package com.example.cinemate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboard3 : AppCompatActivity() {

    lateinit var button3: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)

        val button3 = findViewById<Button>(R.id.start)

        button3.setOnClickListener {
            val intent = Intent(this@onboard3, Login::class.java)
            startActivity(intent)
        }



    }
}