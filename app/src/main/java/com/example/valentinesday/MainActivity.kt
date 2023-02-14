package com.example.valentinesday

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }, 3000)

         val textView = findViewById<TextView>(R.id.text)
        textView.setText("Happy Valentines Day");
        textView.setTextColor(Color.BLACK);


    }
}