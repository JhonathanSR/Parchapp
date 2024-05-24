package com.example.parchapp


import android.content.Intent
<<<<<<< HEAD

=======
//import android.os.Bundle
>>>>>>> 65254eea984677fabf3342548522acfd38862ff7
import android.widget.ImageView

import android.os.Bundle

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

<<<<<<< HEAD
        /*var imgA1 = findViewById<ImageView>(R.id.imgA1)
        imgA1.setOnClickListener {
            goMen()*/
        }
=======
        /*var img_An4 = findViewById<ImageView>(R.id.img_An4)
        img_An4.setOnClickListener {
            goMen()
        }*/
>>>>>>> 65254eea984677fabf3342548522acfd38862ff7
    }
    /*private fun goMen(){
        val i = Intent (this, MainMenu::class.java )
<<<<<<< HEAD
        startActivity(i)*/

=======
        startActivity(i)


    }
}
>>>>>>> 65254eea984677fabf3342548522acfd38862ff7
