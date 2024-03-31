package com.kevinhomorales.customviewskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kevinhomorales.customviewskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpActions()
    }

    private fun setUpActions() {
        binding.tapId.setOnClickListener {
            showAlert()
        }
    }

    private fun showAlert() {
        // Mostrar un diálogo de confirmación
        showConfirmationDialog("Confirmación", "¿Estás seguro de que deseas continuar?") {
            // Acción positiva
            showToast(this, "Operación confirmada")
        }
    }
}