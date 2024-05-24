package com.example.parchapp

import android.content.Intent
import android.os.Bundle
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
    lateinit var edtNombre: EditText
    lateinit var edtPass: EditText
    lateinit var btn_Sesion: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)*/

        usuariosDBHelper = mySQLiteHelper(this)
        edtNombre = findViewById(R.id.edtNombre)
        edtPass = findViewById(R.id.edtPass)
        btn_Sesion = findViewById(R.id.btn_Sesion)

        btn_Sesion.setOnClickListener {
            val nombre = edtNombre.text.toString()
            val contraseña = edtPass.text.toString()
            if (usuariosDBHelper.obtenerDatos(nombre, contraseña)){
                Toast.makeText(this, "Ingreso Exitoso", Toast.LENGTH_LONG).show()
                val i = Intent(this, MainMenu::class.java)
                startActivity(i)
                finish()
                //usuariosDBHelper.iniciarDatabase()
            }else {
                Toast.makeText(this, "Contrasena o usuario invalidos",
                    Toast.LENGTH_SHORT).show()
            }
        }



        /*var btn_Sesion = findViewById<Button>(R.id.btn_Sesion)
        btn_Sesion.setOnClickListener {
            goIniciar()
        }*/
        var txt_Registrate = findViewById<TextView>(R.id.txt_Registrate)
        txt_Registrate.setOnClickListener {
            goRegistrar()
        }

    }
    /*private fun goIniciar(){
        val i =Intent (this, MainMenu::class.java)
        startActivity(i)
    }*/
    private fun goRegistrar(){
    val i = Intent(this, MainRegistro::class.java )
        startActivity(i)
    }
}