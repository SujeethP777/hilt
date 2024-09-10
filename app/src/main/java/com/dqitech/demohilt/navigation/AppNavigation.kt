package com.dqitech.demohilt.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import com.dqitech.demohilt.screen.DetailScreen
import com.dqitech.demohilt.screen.MainScreen
import androidx.navigation.compose.composable


@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "main") {
        composable("main") { MainScreen(navController) }
        composable("details/{item}") { backStackEntry ->
            val item = backStackEntry.arguments?.getString("item")
            item?.let { DetailScreen(it) }
        }
    }
}