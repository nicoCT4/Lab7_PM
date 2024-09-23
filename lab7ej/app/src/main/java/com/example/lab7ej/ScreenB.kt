package com.example.lab7ej

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ScreenB(navController: NavHostController) {
    val modifier = Modifier
    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        var nameValue by remember { mutableStateOf("") }
        var ageValue by remember { mutableStateOf("") }
        var mailValue by remember { mutableStateOf("") }
        Text(text = "Ingresa tus Datos", fontSize = 55.sp, lineHeight = 60.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(30.dp))
        TextField(
            value = nameValue,
            onValueChange = {nameValue = it},
            modifier.padding(10.dp),
            placeholder = {
                Text(text = "Ingresa tu nombre")
            }
        )
        TextField(
            value = ageValue,
            onValueChange = {ageValue = it},
            modifier.padding(10.dp),
            placeholder = {
                Text(text = "Ingresa tu edad")
            }
        )
        TextField(
            value = mailValue,
            onValueChange = {mailValue = it},
            modifier.padding(10.dp),
            placeholder = {
                Text(text = "Ingresa tu correo electronico")
            }
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate("C?name=$nameValue&age=$ageValue&mail=$mailValue")
        }) {
            Text(text = "Siguiente", fontSize = 40.sp)
        }
    }
}

