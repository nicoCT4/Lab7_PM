package com.example.lab7ej

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.example.lab7ej.ui.theme.Lab7ejTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab7ejTheme {
                Org()
            }
        }
    }


    // Método que puede ser llamado desde un Composable para iniciar MainActivity2
    fun navigateToMainActivity2() {
        // Definir el Intent para iniciar MainActivity2
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent) // Iniciar la nueva actividad
    }
}
