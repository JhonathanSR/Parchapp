package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainHistorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_historial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var imgA3 = findViewById<ImageView>(R.id.imgA3)
        imgA3.setOnClickListener {
            goPerfil2()
        }
        var img_Log8 = findViewById<ImageView>(R.id.img_Log8)
        img_Log8.setOnClickListener {
            goMenu2()
        }
    }
    private fun goPerfil2(){
        val i = Intent(this, MainPerfil::class.java)
        startActivity(i)
    }
    private fun goMenu2(){
        val i = Intent(this, MainMenu::class.java)
        startActivity(i)
    }
}