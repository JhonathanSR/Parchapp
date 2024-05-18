package com.example.parchapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parchapp.databinding.ActivityMainRegistroBinding

class MainRegistro : AppCompatActivity() {
    lateinit var binding: ActivityMainRegistroBinding
    lateinit var usuariosDBHelper: mySQLiteHelper
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityMainRegistroBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_registro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usuariosDBHelper = mySQLiteHelper(this)
        binding.btnRegistro.setOnClickListener {
            if (binding.edTNombre.text.isNotBlank() &&
                binding.edTPass2.text.isNotBlank()
            ) {
                usuariosDBHelper.anadirdato(
                    binding.edTNombre.text.toString(),
                    binding.edTPass2.text.toString()
                )
                binding.edTNombre.text.clear()
                binding.edTPass2.text.clear()
                Toast.makeText(
                    this, "Registro Completo",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this, "No se ha podido Registrar",
                    Toast.LENGTH_LONG
                ).show()

            }
        }

        var img_AnT = findViewById<ImageView>(R.id.img_An4)
        img_AnT.setOnClickListener {
            goAtras()
        }
        /*var btn_Registro = findViewById<Button>(R.id.btn_Registro)
        btn_Registro.setOnClickListener {
            goRegistro()
        }*/
        var img_Logoregistro = findViewById<ImageView>(R.id.img_Logoregistro)
        img_Logoregistro.setOnClickListener {
            goRegis()
        }
    }
    private fun goAtras(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    private fun goRegistro(){
        val i = Intent(this, MainPerfil::class.java)
        startActivity(i)
    }
    private fun goRegis(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}

class ActivityMainRegistroBinding {

}
