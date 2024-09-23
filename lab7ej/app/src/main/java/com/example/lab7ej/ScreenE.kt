package com.example.lab7ej

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenE(navController: NavHostController, uni: String?, carrera: String?, anio: Int?) {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFD3D3D3)).padding(horizontal = 16.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Registro", fontSize = 54.sp)
        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "La universidad en la que estudias es: $uni", fontSize = 30.sp,lineHeight = 60.sp,)
        Spacer(modifier = Modifier.height(45.dp))
        Text(
            text = "El año que cursas es: $anio",
            fontSize = 30.sp,
            lineHeight = 60.sp,
            modifier = if (anio == 0) {
                Modifier.align(Alignment.CenterHorizontally) // Si es el valor por defecto, centrado
            } else {
                Modifier.align(Alignment.Start) // Si tiene valor, alineado a la izquierda
            }
        )
        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "Tu Carrera es: $carrera", fontSize = 30.sp,lineHeight = 60.sp,)
        Spacer(modifier = Modifier.height(45.dp))
        Button(
            onClick = {
                // Crear un Intent para iniciar MainActivity
                val context = navController.context
                val intent = Intent(context, MainActivity::class.java).apply {
                    putExtra("navigateTo", "A") // Pasar un valor extra si es necesario
                }
                context.startActivity(intent)
            },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            )
        ) {
            Text(text = "Regresar al Menú", fontSize = 25.sp, lineHeight = 60.sp)
        }

        Spacer(modifier = Modifier.height(65.dp))

        Button(onClick = {
            navController.popBackStack()
        }, modifier = Modifier.fillMaxWidth(0.8f).padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            )
        ) {
            Text(text = "Atras", fontSize = 25.sp, lineHeight = 60.sp)
        }
    }
}