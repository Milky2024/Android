package com.example.proyectoapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val boton1: Button =findViewById(R.id.btnIngresar)
            boton1.setOnClickListener { ingresarnombre() }
        }

    private fun ingresarnombre() {

        val lblNombre: TextView=findViewById(R.id.lblRespuesta)
        val campoNombre:EditText=findViewById(R.id.txtNombre)
        var nombre=campoNombre.text
        lblNombre.text=nombre
        Toast.makeText(this, "Bienvenido $nombre", Toast.LENGTH_LONG).show()
    }

    }
