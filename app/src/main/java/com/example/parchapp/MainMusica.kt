package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMusica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_musica)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var imgLog4 = findViewById<ImageView>(R.id.imgLog4)
        imgLog4.setOnClickListener {
            goPerfil()
        }
        var imgA5 = findViewById<ImageView>(R.id.imgA5)
        imgA5.setOnClickListener {
            goMenu()
        }
        var imgBut4 = findViewById<ImageButton>(R.id.imgBut4)
        imgBut4.setOnClickListener {
            goMusic2()
        }
    }
    private  fun goPerfil(){
        val i = Intent(this, MainPerfil::class.java)
        startActivity(i)
    }
    private fun goMenu(){
        val i = Intent(this, MainMenu::class.java)
        startActivity(i)
    }
    private fun goMusic2(){
        val i = Intent(this, MainMusic2::class.java)
        startActivity(i)
    }

}