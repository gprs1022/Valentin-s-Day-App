package com.example.valentinesday

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()

        val historyCardView = findViewById<CardView>(R.id.history)
        val messageCardView = findViewById<CardView>(R.id.message)

        historyCardView.setOnClickListener {
            intent = Intent(this,history::class.java)
            startActivity(intent)
        }

        messageCardView.setOnClickListener {
            intent = Intent(this,message::class.java)
            startActivity(intent)
        }



    }
}