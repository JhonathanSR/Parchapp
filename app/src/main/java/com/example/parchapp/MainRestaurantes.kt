package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainRestaurantes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_restaurantes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_left2 = findViewById<ImageButton>(R.id.left2)
        btn_left2.setOnClickListener{
            goCultura()
        }
        val btn_right2 = findViewById<ImageButton>(R.id.right2)
        btn_right2.setOnClickListener {
            goDeport()
        }
    }
    private fun goCultura(){
        val i = Intent(this, MainCultura::class.java)
        startActivity(i)
    }
    private fun goDeport(){
        val i = Intent(this, MainDeportes::class.java)
        startActivity(i)
    }
}