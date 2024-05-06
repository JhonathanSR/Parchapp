package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMusic2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_music2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var img_Ant3 = findViewById<ImageView>(R.id.img_Ant8)
        img_Ant3.setOnClickListener {
            goMusica()
        }
        var img_Log4 = findViewById<ImageView>(R.id.img_Log4)
        img_Log4.setOnClickListener {
            goPerf()
        }
    }
    private fun goMusica(){
        val i = Intent(this, MainMusica::class.java)
        startActivity(i)
    }
    private fun goPerf(){
        val i = Intent(this, MainPerfil::class.java)
        startActivity(i)
    }
}