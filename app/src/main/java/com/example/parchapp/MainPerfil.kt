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
    lateinit var  usuariosDBHelper: mySQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_perfil)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var imgA6 = findViewById<ImageView>(R.id.imgA6)
        imgA6.setOnClickListener {
            goMenu()
        }
        var img_Salir = findViewById<ImageView>(R.id.img_Salir)
        img_Salir.setOnClickListener {
            goSalida()
        }
        var btnGuard = findViewById<Button>(R.id.btnGuard)
        btnGuard.setOnClickListener {
            goMenu1()
        }
        var btn_Hist = findViewById<Button>(R.id.btn_Hist)
        btn_Hist.setOnClickListener {
            goHist()
        }
        /*var editNom = findViewById<Button>(R.id.editNom)
        editNom.setOnClickListener {
            goNombre()
        }*/
    }

    private fun goMenu() {
        val i = Intent(this, MainMenu::class.java)
        startActivity(i)
    }

    private fun goSalida() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    private fun goMenu1() {
        val i = Intent(this, MainMenu::class.java)
        startActivity(i)
    }

    private fun goHist() {
        val i = Intent(this, MainHistorial::class.java)
        startActivity(i)
    }
}