package com.example.guided2_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val btnPrevious = findViewById<Button>(R.id.btnPrevious)

        btnPrevious.setOnClickListener{
            val intent = Intent(this,NextActivity::class.java)
            startActivity(intent)
        }
    }
}