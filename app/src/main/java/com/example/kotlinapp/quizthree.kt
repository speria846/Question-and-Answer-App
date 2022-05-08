package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class quizthree : AppCompatActivity() {
    lateinit var btnkabutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizthree)
        btnkabutton=findViewById(R.id.btbkabutton)
        btnkabutton.setOnClickListener {
            val intent= Intent(this,Answers::class.java)
            startActivity(intent)
        }
    }
}