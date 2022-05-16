package com.example.mobile3_assignment2

sealed class NavRoutes(val route: String) {
    object Welcome : NavRoutes("Welcome")
    object Details : NavRoutes("Details")
    object CurrentModules : NavRoutes("CurrentModules")
}
