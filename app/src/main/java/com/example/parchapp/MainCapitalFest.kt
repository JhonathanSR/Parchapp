package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainCapitalFest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_capitalfest)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_parchar = findViewById<Button>(R.id.btn_Parchar)
        btn_parchar.setOnClickListener{
            goNewEvent()
        }
        var back7 = findViewById<ImageView>(R.id.back7)
        back7.setOnClickListener {
            goMusica()
        }
    }
    private fun goNewEvent(){
        val i = Intent(this, MainNewEvent::class.java)
        startActivity(i)
    }
    private fun goMusica(){
        val i = Intent(this, MainMusica::class.java)
        startActivity(i)
    }

}