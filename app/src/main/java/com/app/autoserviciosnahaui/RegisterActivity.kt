package com.app.autoserviciosnahaui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // 1. Encontrar las vistas
        val tvLoginLink = findViewById<TextView>(R.id.tvLoginLink)
        val btnBack = findViewById<ImageView>(R.id.btnBack) // Ahora sí tiene ID

        // 2. Evento para ir al Login desde el link inferior
        tvLoginLink.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        // 3. Evento para la flecha de atrás
        btnBack.setOnClickListener {
            // finish() simplemente cierra la pantalla actual y te regresa a la anterior
            finish()
        }
    }
}
