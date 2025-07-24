package com.example.libmanagment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.libmanagment.ui.theme.LibManagmentTheme
import com.example.libmanagment.ui.theme.components.AddEditScreen
import com.example.libmanagment.ui.theme.components.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibManagmentTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Screen.Home.route) {
                    composable(Screen.Home.route) {
                        HomeScreen(navController = navController)
                    }

                    composable(
                        route = Screen.AddEdit.route,
                        arguments = listOf(navArgument("bookId") {
                            type = NavType.IntType
                            defaultValue = -1
                        })
                    ) { backStackEntry ->
                        val bookId = backStackEntry.arguments?.getInt("bookId") ?: -1
                        AddEditScreen(navController = navController, bookId = bookId)
                    }
                }
            }
        }

    }
}
