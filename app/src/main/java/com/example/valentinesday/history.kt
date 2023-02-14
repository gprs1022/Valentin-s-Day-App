package com.example.valentinesday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class history : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        supportActionBar?.hide()

        val knowmore = findViewById<Button>(R.id.knowmore)



        knowmore.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Valentine%27s_Day#:~:text=It%20originated%20as%20a%20Christian,many%20regions%20of%20the%20world.")
            startActivity(intent)
        }
    }
}