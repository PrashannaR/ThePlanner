package com.prashannar.theplanner.presentation.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.prashannar.theplanner.presentation.FirstScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController =navController, startDestination = Screens.FirstScreen.route){
        composable(route = Screens.FirstScreen.route){
            FirstScreen()
        }
    }

}