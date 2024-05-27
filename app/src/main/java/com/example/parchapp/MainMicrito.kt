package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMicrito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_micrito)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_parchar = findViewById<Button>(R.id.btn_Parchar)
        btn_parchar.setOnClickListener {
            goNewEvent()
        }
        val back8 = findViewById<ImageView>(R.id.back8)
        back8.setOnClickListener {
            goDeport()
        }
    }
    private fun goNewEvent(){
        val i = Intent(this, MainNewEvent::class.java)
        startActivity(i)
    }
    private fun goDeport(){
        val i = Intent(this, MainDeportes::class.java)
        startActivity(i)
    }
}