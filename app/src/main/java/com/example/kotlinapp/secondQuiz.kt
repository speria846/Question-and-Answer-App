package com.example.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondQuiz : AppCompatActivity() {
    lateinit var btnnext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_quiz)
        btnnext3=findViewById(R.id.btnnext3)
        btnnext3.setOnClickListener {
            val intent = Intent(this, quizthree::class.java)
            startActivity(intent)
        }
}
}