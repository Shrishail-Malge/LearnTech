package com.example.learntech

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Block : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block)

        val learn = findViewById<CardView>(R.id.cdblm)

        learn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.xilinx.com/products/design-tools/resources/the-developers-guide-to-blockchain-development.html#:~:text=What%20Is%20Blockchain%20Development%3F,like%20copyrights%E2%80%94within%20a%20network.")
            startActivity(intent)
        }
    }
}