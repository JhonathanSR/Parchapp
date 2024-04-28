package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var btn_Perfil = findViewById<Button>(R.id.btn_Perfil)
        btn_Perfil.setOnClickListener {
            goPerfil()
        }
        var img_Exit = findViewById<ImageView>(R.id.img_Exit)
        img_Exit.setOnClickListener {
            goExit()
        }
    }
    private fun goPerfil(){
        val i = Intent(this, MainPerfil::class.java)
        startActivity(i)
    }
    private fun goExit(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}