package com.example.practical

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.practical.ui.theme.PracticalTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.practical.screens.HomeScreen
import com.example.practical.screens.Details

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticalTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Welcome.route,
    ) {
        composable(NavRoutes.Welcome.route) {
            HomeScreen(navController = navController)
        }

        composable(NavRoutes.Details.route ) {
            Details(navController = navController)
        }

    }
}


