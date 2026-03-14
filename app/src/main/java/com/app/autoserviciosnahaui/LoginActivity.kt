package com.app.autoserviciosnahaui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 1. Encontrar las vistas
        val tvRegisterLink = findViewById<TextView>(R.id.tvRegisterLink)
        val btnBack = findViewById<ImageView>(R.id.btnBack)

        // 2. Evento para ir a la pantalla de Registro
        tvRegisterLink.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            // No usamos finish() aquí para que si el usuario retrocede desde registro,
            // vuelva al login y no a la pantalla de bienvenida directamente.
        }

        // 3. Evento para la flecha de atrás (Vuelve a Welcome)
        btnBack.setOnClickListener {
            finish() // Cierra el login y regresa a la actividad anterior (Welcome)
        }

        // Encontrar el botón de "¿Olvidé mi contraseña?"
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)

        // Asignarle el evento de clic
        tvForgotPassword.setOnClickListener {
            // Crear el Intent para ir a ForgotPasswordActivity
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}