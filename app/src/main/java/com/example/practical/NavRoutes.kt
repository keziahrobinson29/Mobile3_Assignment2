package com.example.practical

sealed class NavRoutes(val route: String) {
    object Welcome : NavRoutes("Welcome")
    object Details : NavRoutes("Details")

}
