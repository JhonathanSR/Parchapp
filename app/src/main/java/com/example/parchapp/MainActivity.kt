package com.example.parchapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parchapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var usuariosDBHelper: mySQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        usuariosDBHelper = mySQLiteHelper(this)
        //val contrasena = findViewById<EditText>(R.id.edtPass)
        val txt_Registrate = findViewById<TextView>(R.id.txt_Registrate)

        val btn_Sesion = findViewById<Button>(R.id.btn_Sesion)
        btn_Sesion.setOnClickListener {
            loginUser()

        }
        txt_Registrate.setOnClickListener {
            goRegis()
        }
    }
    private  fun loginUser(){
        val nombre = findViewById<EditText>(R.id.edtNombre).text.toString()
        val contrasena = findViewById<EditText>(R.id.edtPass).text.toString()



        Log.d("LoginUser", "Nombre: $nombre, Contraseña: $contrasena")

        if (nombre.isNotEmpty() && contrasena.isNotEmpty()) {
            val resultado = usuariosDBHelper.obtenerDatos(nombre, contrasena)

            Log.d("LoginUser", "User login resultado: $resultado")

            if (resultado) {
                Toast.makeText(this, "Inicio de Sesión Exitoso",
                    Toast.LENGTH_SHORT).show()
                findViewById<EditText>(R.id.edtNombre).setText("")
                findViewById<EditText>(R.id.edtPass).setText("")

                val i = Intent(this, MainMenu::class.java)
                startActivity(i)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "Complete todos los campos",
                Toast.LENGTH_SHORT).show()
        }

    }
    private fun goRegis(){
        val i = Intent(this, MainRegistro::class.java)
        startActivity(i)
    }
}

