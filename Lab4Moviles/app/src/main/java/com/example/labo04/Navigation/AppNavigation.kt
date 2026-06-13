package com.example.labo04.Navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.labo04.view.screens.HomeScreen
import com.example.labo04.view.screens.TaskScreen
import com.example.labo04.ViewModel.GeneralViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val viewModel: GeneralViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(
                onNavigateToTasks = {
                    navController.navigate("tasks")
                }
            )
        }

        composable("tasks") {
            TaskScreen(
                viewModel = viewModel,
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}
