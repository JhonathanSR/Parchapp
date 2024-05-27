package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.sax.StartElementListener
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainCultura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_cultura)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_left = findViewById<ImageButton>(R.id.left)
        btn_left.setOnClickListener {
            goMusica()
        }

        val btn_right = findViewById<ImageButton>(R.id.right)
        btn_right.setOnClickListener {
            goResta()
        }

        var btn_Museo = findViewById<ImageButton>(R.id.Museo)
        btn_Museo.setOnClickListener {
            goMuseo()
        }
    }

    private fun goMusica() {
        val i = Intent(this, MainMusica::class.java)
        startActivity(i)
    }

    private fun goResta() {
        val i = Intent(this, MainRestaurantes::class.java)
        startActivity(i)
    }

    private fun goMuseo(){
        val i = Intent(this, MainOroMuseo::class.java)
        startActivity(i)
    }
}
