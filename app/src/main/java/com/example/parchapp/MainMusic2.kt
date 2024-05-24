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
        var imgA4 = findViewById<ImageView>(R.id.imgA4)
        imgA4.setOnClickListener {
            goMusica()
        }
        var imgLogM = findViewById<ImageView>(R.id.imgLogM)
        imgLogM.setOnClickListener {
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