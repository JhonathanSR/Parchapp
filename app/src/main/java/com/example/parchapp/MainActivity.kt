package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btn_Sesion = findViewById<Button>(R.id.btn_Sesion)
        btn_Sesion.setOnClickListener {
            goIniciar()
        }
        var txt_Registrate = findViewById<TextView>(R.id.txt_Registrate)
        txt_Registrate.setOnClickListener {
            goRegistrar()
        }

    }
    private fun goIniciar(){
        val i =Intent (this, MainMenu::class.java)
        startActivity(i)
    }
    private fun goRegistrar(){
    val i = Intent(this, MainRegistro::class.java )
        startActivity(i)
    }
}