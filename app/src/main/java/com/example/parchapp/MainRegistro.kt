package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_registro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var img_Atras = findViewById<ImageView>(R.id.img_Anterior)
        img_Atras.setOnClickListener {
            goAtras()
        }
        var btn_Registro = findViewById<Button>(R.id.btn_Registro)
        btn_Registro.setOnClickListener {
            goRegistro()
        }
        var img_Logoregistro = findViewById<ImageView>(R.id.img_Logoregistro)
        img_Logoregistro.setOnClickListener {
            goRegis()
        }
    }
    private fun goAtras(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun goRegistro(){
        val i = Intent(this, MainPerfil::class.java)
        startActivity(i)
    }
    private fun goRegis(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}