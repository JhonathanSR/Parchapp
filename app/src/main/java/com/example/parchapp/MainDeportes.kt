package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainDeportes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_deportes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_left1 = findViewById<ImageButton>(R.id.left1)
        btn_left1.setOnClickListener(){
            goResta()
    }
        val btn_micrito = findViewById<ImageButton>(R.id.micrito)
        btn_micrito.setOnClickListener {
            goMicrito()
        }

}
    private fun goMicrito(){
        val i = Intent(this, MainMicrito::class.java)
        startActivity(i)
    }
    private fun goResta(){
        val i = Intent(this, MainRestaurantes::class.java)
        startActivity(i)
    }

}