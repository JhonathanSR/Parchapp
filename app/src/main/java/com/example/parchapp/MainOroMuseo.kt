package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainOroMuseo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_oro_museo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_Museo = findViewById<Button>(R.id.btn_Parchar)
        btn_Museo.setOnClickListener{
            goNewEvent()
        }
        var back9 = findViewById<ImageView>(R.id.back9)
        back9.setOnClickListener {
            goCultura()
        }

    }
    private fun goNewEvent(){
        val i = Intent(this, MainNewEvent::class.java)
        startActivity(i)
    }
    private fun goCultura(){
        val i = Intent(this, MainCultura::class.java)
        startActivity(i)
    }
}