package com.example.parchapp


import android.content.Intent

import android.widget.ImageView

import android.os.Bundle

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainCultura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_cultura)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*var imgA1 = findViewById<ImageView>(R.id.imgA1)
        imgA1.setOnClickListener {
            goMen()*/
        }
    }
    /*private fun goMen(){
        val i = Intent (this, MainMenu::class.java )
        startActivity(i)*/

