package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnPlay2 = findViewById<Button>(R.id.btnPlay2)
        val bordyapatron = findViewById<TextView>(R.id.textView5)
        bordyapatron.text = "10"
        val shikiyabintu= findViewById<TextView>(R.id.textView6)
        shikiyabintu.text = "10"
        btnPlay2.setOnClickListener {
            val intent = Intent(this@MainActivity4,MainActivity5::class.java )
            startActivity(intent)
        }
    }
}