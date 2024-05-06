package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tamagotchiapp.R.id.btnClean2
import com.example.tamagotchiapp.R.id.editTextNumber


class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnClean2 = findViewById<Button>(btnClean2)
        val valeur = findViewById<TextView>(editTextNumber)
        valeur.text = "10"

        btnClean2.setOnClickListener {
            val intent = Intent(this@MainActivity3 ,MainActivity4::class.java )
            startActivity(intent)
        }
    }
}