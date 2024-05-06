package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val caboche = findViewById<TextView>(R.id.textView7)
        caboche.text = "10"
        val mbata = findViewById<TextView>(R.id.textView11)
        mbata.text = "10"
        val horsjeux = findViewById<TextView>(R.id.textView12)
        horsjeux.text = "10"
    }
}