package com.example.valentinesday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class message : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        supportActionBar?.hide()
    }
}