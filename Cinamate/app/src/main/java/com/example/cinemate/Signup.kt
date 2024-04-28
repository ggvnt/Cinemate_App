package com.example.cinemate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {

    lateinit var button: Button;
    lateinit var textView: TextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        button = findViewById(R.id.signup)

        button.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val textView = findViewById<TextView>(R.id.signintext)

        textView.setOnClickListener {
            val intent = Intent(this@Signup, Login::class.java)
            startActivity(intent)
        }
    }
}