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
            registerEvento("parchemos")// cambiar parchemos por obtener los datos de imagebutton de musica
        }
        var imgBut1 = findViewById<ImageButton>(R.id.imgBut1)
        imgBut1.setImageResource(R.drawable.capitalfest)

        var right2 = findViewById<ImageView>(R.id.right2)
        right2.setOnClickListener {
            goMusic2()
        }

    }
    private  fun registerEvento(evento: String){
        val intent = Intent(this, MainHistorial::class.java)
        intent.putExtra("evento", evento)
        startActivity(intent)
    }
    private fun goEvent1(){

    }
    private fun goReverse2(){
        val  i = Intent(this, MainMenu::class.java)
        startActivity(i)

    }
    private fun goInscrito(){

    }
    private fun goMusic2(){
        val i = Intent(this, MainMusic2::class.java)
        startActivity(i)
    }
}
