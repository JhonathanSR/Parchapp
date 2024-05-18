package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainPerfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_perfil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var img_Anterior = findViewById<ImageView>(R.id.img_Ant10)
        img_Anterior.setOnClickListener {
            goAnterior()
        }
        var btn_Inicio = findViewById<Button>(R.id.btn_Inicio)
        btn_Inicio.setOnClickListener {
            goInicio()
        }
        var img_Salir = findViewById<ImageView>(R.id.img_Salir)
        img_Salir.setOnClickListener {
            goSalir()
        }
        var btn_Hist = findViewById<Button>(R.id.btn_Hist)
        btn_Hist.setOnClickListener {
            goHistorial()
        }
    }
    private fun goAnterior(){
        val i = Intent(this, MainMenu::class.java)
        startActivity(i)
    }
    private fun goInicio(){
        val i = Intent(this, MainMenu::class.java)
        startActivity(i)

    }
    private fun goSalir(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun goHistorial(){
        val i = Intent(this, MainHistorial::class.java)
        startActivity(i)
    }
}