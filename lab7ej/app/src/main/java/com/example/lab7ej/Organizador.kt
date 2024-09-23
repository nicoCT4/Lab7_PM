package com.example.lab7ej

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Org(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A"){

        composable(route = "A"){
            ScreenA(navController)
        }

        composable(route = "B"){
            ScreenB(navController)
        }

        composable(route = "C?name={name}&age={age}&mail={mail}",
            arguments = listOf(
                navArgument(name = "name"){
                    type = NavType.StringType
                    nullable = true
                },
                navArgument(name = "age"){
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument(name = "mail"){
                    type = NavType.StringType
                    defaultValue = "Vacio"
                }
            )
        ){ backstackEntry ->
            ScreenC(
                navController,
                myName = backstackEntry.arguments?.getString("name"),
                myAge = backstackEntry.arguments?.getInt("age"),
                myMail = backstackEntry.arguments?.getString("mail")
                )
        }
    }
}