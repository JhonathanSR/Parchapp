package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parchapp.databinding.ActivityMainMusicaBinding

class MainMusica : AppCompatActivity() {
    lateinit var  binding: ActivityMainMusicaBinding
    lateinit var usuariosDBHelper: mySQLiteHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_musica)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainMusicaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnParch1 = findViewById<Button>(R.id.btnParch1)
        btnParch1.setOnClickListener {
            goNewEvent()
        }
        var imgBut1 = findViewById<ImageButton>(R.id.imgBut1)
        imgBut1.setOnClickListener {
            goCapital()
        }

        var right2 = findViewById<ImageView>(R.id.right2)
        right2.setOnClickListener {
            goCultura()
        }

    }
    private  fun registerEvento(evento: String){
        val intent = Intent(this, MainHistorial::class.java)
        intent.putExtra("capitalfest", evento)
        startActivity(intent)
    }
    private fun goNewEvent(){
        val i = Intent(this,MainNewEvent::class.java)

    }
    private fun goReverse2(){
        val  i = Intent(this, MainMenu::class.java)
        startActivity(i)

    }
    private fun goCapital(){
        val i = Intent(this,MainCapitalFest::class.java)
        startActivity(i)
    }
    private fun goCultura(){
        val i = Intent(this, MainCultura::class.java)
        startActivity(i)
    }
}
