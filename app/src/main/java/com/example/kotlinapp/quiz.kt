package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class quiz : AppCompatActivity() {
    lateinit var btnnext:Button
    lateinit var btnskip:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        btnnext=findViewById(R.id.btnnext)
        btnskip=findViewById(R.id.btnskip)
        btnnext.setOnClickListener {
            val intent= Intent(this,secondQuiz::class.java)
            startActivity(intent)
        }
        btnskip.setOnClickListener {
            val intent= Intent(this,secondQuiz::class.java)
            startActivity(intent)
        }
    }
}