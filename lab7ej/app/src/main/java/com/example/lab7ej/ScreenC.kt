package com.example.lab7ej

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenC(navController: NavHostController, myName: String?, myAge: Int?, myMail: String?) {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFD3D3D3)).padding(horizontal = 16.dp), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Registro", fontSize = 54.sp)
        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "Tu nombre es: $myName", fontSize = 30.sp,lineHeight = 60.sp,)
        Spacer(modifier = Modifier.height(45.dp))
        Text(
            text = "Tu edad es: $myAge",
            fontSize = 30.sp,
            lineHeight = 60.sp,
            modifier = if (myAge == 0) {
                Modifier.align(Alignment.CenterHorizontally) // Si es el valor por defecto, centrado
            } else {
                Modifier.align(Alignment.Start) // Si tiene valor, alineado a la izquierda
            }
        )
        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "Tu correo es: $myMail", fontSize = 30.sp,lineHeight = 60.sp,)
        Spacer(modifier = Modifier.height(45.dp))
        Button(onClick = {
            navController.navigate("A"){
                popUpTo("A"){inclusive=true}
            }

        }, modifier = Modifier.fillMaxWidth(0.8f).padding(horizontal = 16.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = Color.Black
            )
            ) {
            Text(text = "Regresar al Menu", fontSize = 25.sp, lineHeight = 60.sp)
        }
        Spacer(modifier = Modifier.height(65.dp))
        Button(onClick = {
            navController.navigate("B")
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


