package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainRicchezza : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_ricchezza)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_parchar = findViewById<Button>(R.id.btn_Parchar)
        btn_parchar.setOnClickListener{
            goNewEvent()
        }
        val back10 = findViewById<ImageView>(R.id.back10)
        back10.setOnClickListener {
            goRestaurant()
        }
    }
    private fun goNewEvent(){
        val i = Intent(this, MainNewEvent::class.java)
        startActivity(i)
    }
    private fun goRestaurant(){
        val i = Intent(this, MainRestaurantes::class.java)
        startActivity(i)
    }

}