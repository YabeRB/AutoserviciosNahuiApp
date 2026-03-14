package com.app.autoserviciosnahaui

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        // Encontrar el LinearLayout que funciona como botón de regreso
        val btnBackToLogin = findViewById<LinearLayout>(R.id.btnBackToLogin)

        // Asignarle el evento de clic
        btnBackToLogin.setOnClickListener {
            // finish() cierra esta pantalla y te devuelve a la anterior (LoginActivity)
            finish()
        }
    }
}