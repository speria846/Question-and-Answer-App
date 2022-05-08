package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class questions : AppCompatActivity() {
    lateinit var btnnext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        btnnext2=findViewById(R.id.btnnext2)
        btnnext2.setOnClickListener {
            val intent=Intent(this,quiz::class.java)
            startActivity(intent)
        }
    }
}