package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnclick:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnclick=findViewById(R.id.btnclick)
        btnclick.setOnClickListener {
            val intent=Intent(this,questions::class.java)
            startActivity(intent)
        }

    }
}