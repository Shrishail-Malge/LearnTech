package com.example.learntech

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val learn = findViewById<CardView>(R.id.cdLearn)

        learn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://google-developer-training.github.io/android-developer-fundamentals-course-concepts-v2/")
            startActivity(intent)
        }
    }
}