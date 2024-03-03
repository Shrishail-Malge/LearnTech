package com.example.learntech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val android = findViewById<CardView>(R.id.cdAndroid)
        val web = findViewById<CardView>(R.id.cdWeb)
        val ds = findViewById<CardView>(R.id.cdDS)
        val block = findViewById<CardView>(R.id.cdBlock)

        android.setOnClickListener {
            val intent = Intent(this,Android::class.java)
            startActivity(intent)
        }

        web.setOnClickListener {
            val intent = Intent(this, Web::class.java)
            startActivity(intent)
        }

        ds.setOnClickListener {
            val intent = Intent(this, DataS::class.java)
            startActivity(intent)
        }

        block.setOnClickListener {
            val intent = Intent(this, Block::class.java)
            startActivity(intent)
        }

    }
}