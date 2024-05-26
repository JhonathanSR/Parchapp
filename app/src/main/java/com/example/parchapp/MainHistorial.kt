package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainHistorial : AppCompatActivity() {
    lateinit var usuariosDBHelper: mySQLiteHelper
    lateinit var imgButH1: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_historial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val evento = intent.getStringExtra("capitalfest")

        val imgButH1 = findViewById<ImageButton>(R.id.imgButH1)
        imgButH1.setImageResource(R.drawable.capitalfest)

        val imgA3 = findViewById<ImageView>(R.id.imgA3)
        imgA3.setOnClickListener {
            goperfil()
        }
        val btn_Consultar = findViewById<Button>(R.id.btn_Consultar)
        btn_Consultar.setOnClickListener {
            goConsultar()
        }
        val btn_Modificar = findViewById<Button>(R.id.btn_Modificar)
        btn_Modificar.setOnClickListener {
            goModif()
        }
        val btn_Eliminar = findViewById<Button>(R.id.btn_Eliminar)
        btn_Eliminar.setOnClickListener {
            goElim()
        }
        val btn_Guardar = findViewById<Button>(R.id.btn_Guardar)
        btn_Guardar.setOnClickListener {
            goGuar()
        }
    }
    private fun goperfil(){
        val i = Intent(this, MainPerfil::class.java)
        startActivity(i)
    }
    private fun goConsultar(){
        val resultado = usuariosDBHelper.obtenerDatos("nombre",
            "contrasena")
        if (resultado){
            Toast.makeText(this, "Consulta Finalizada",
                Toast.LENGTH_SHORT).show()
            imgButH1.setImageResource(R.drawable.capitalfest)
        } else{
            Toast.makeText(this, "No se encontro lo solicitado",
                Toast.LENGTH_SHORT).show()
        }
    }
    private fun goModif(){
        val exito = usuariosDBHelper.modificarDatos("nombre", "nuevaContrasena")
        if (exito) {
            Toast.makeText(this, "Modificación evento exitosa",
                Toast.LENGTH_SHORT).show()
            imgButH1.setImageResource(R.drawable.event_musica)
        } else {
            Toast.makeText(this, "Error al modificar datos del evento",
                Toast.LENGTH_SHORT).show()
        }
    }
    private fun goElim(){
        val exito = usuariosDBHelper.eliminarDatos("nombre")
        if (exito) {
            Toast.makeText(this, "Eliminación evento exitoso",
                Toast.LENGTH_SHORT).show()
            imgButH1.setImageResource(R.drawable.borrar)
        } else {
            Toast.makeText(this, "Error al eliminar datos",
                Toast.LENGTH_SHORT).show()
        }
    }
    private fun goGuar(){
        val exito = usuariosDBHelper.anadirdato("nombre", "contrasena")
        if (exito) {
            Toast.makeText(this, "Guardado exitoso", Toast.LENGTH_SHORT).show()
            imgButH1.setImageResource(R.drawable.event_musica)
        } else {
            Toast.makeText(this, "Error al guardar datos", Toast.LENGTH_SHORT).show()
        }
    }

}