package com.example.lab7ej

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenD(navController: NavHostController){

    val modifier = Modifier
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFD3D3D3)).padding(horizontal = 16.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        var uni by remember { mutableStateOf("") }
        var carrera by remember { mutableStateOf("") }
        var anio by remember { mutableStateOf("") }
        Text(text = "Ingresa tus Datos", fontSize = 55.sp, lineHeight = 60.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(30.dp))
        TextField(
            value = uni,
            onValueChange = {uni = it},
            modifier.padding(10.dp),
            placeholder = {
                Text(text = "¿En que Universiad Estudias?")
            }
        )
        TextField(
            value = carrera,
            onValueChange = {carrera = it},
            modifier.padding(10.dp),
            placeholder = {
                Text(text = "Ingresa tu carrera")
            }
        )
        TextField(
            value = anio,
            onValueChange = {anio = it},
            modifier.padding(10.dp),
            placeholder = {
                Text(text = "Ingresa el año que cursas")
            }
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate("E?uni=$uni&carrera=$carrera&anio=$anio")
        },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            )
        ) {
            Text(text = "Ver información", fontSize = 40.sp)
        }
    }
}