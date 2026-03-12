package com.app.autoserviciosnahaui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // 1. Encontrar los botones en el layout por su ID
        val btnLogin = findViewById<MaterialButton>(R.id.btnLogin)
        val btnRegister = findViewById<MaterialButton>(R.id.btnRegister)

        // 2. Asignar el evento "onClick" al botón de Login
        btnLogin.setOnClickListener {
            // Crear un Intent para ir de WelcomeActivity a LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // 3. Asignar el evento "onClick" al botón de Registro
        btnRegister.setOnClickListener {
            // Crear un Intent para ir de WelcomeActivity a RegistroActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}