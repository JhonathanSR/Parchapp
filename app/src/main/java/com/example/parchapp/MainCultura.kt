package com.example.parchapp

<<<<<<< HEAD
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
=======
import android.os.Bundle
>>>>>>> ed70edaca10c3bd7e01e7c7f3bbce400e2ab3f52
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
        var img_An4 = findViewById<ImageView>(R.id.img_An4)
        img_An4.setOnClickListener {
            goMen()
        }
    }
    private fun goMen(){
        val i = Intent (this, MainMenu::class.java )
        startActivity(i)
=======
>>>>>>> ed70edaca10c3bd7e01e7c7f3bbce400e2ab3f52
    }
}