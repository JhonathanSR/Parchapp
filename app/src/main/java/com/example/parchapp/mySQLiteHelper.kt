package com.example.parchapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class mySQLiteHelper (context: Context): SQLiteOpenHelper(
    context, "usuarios.db", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val ordenCreacion = "CREATE TABLE usuarios" +
                ("id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "nombre TEXT, contraseña TEXT, email TEXT, ")
        db!!.execSQL(ordenCreacion)
    }

    override fun onUpgrade(db: SQLiteDatabase?,
                           oldVersion: Int, newVersion: Int) {
        val ordenBorrado = "DROP TABLE IF EXISTS usuarios"
        db!!.execSQL(ordenBorrado)
        onCreate(db)
    }
    fun anadirdato(nombre: String, contraseña: String, email: String){
        val datos = ContentValues()
        datos.put("nombre", nombre)
        datos.put("contraseña",contraseña)
        datos.put("email", email)

        val db = this.writableDatabase
        db.insert("usuarios", null, datos)
        db.close()

    }

    fun anadirdato(nombre: String, contraseña: String) {

    }


}