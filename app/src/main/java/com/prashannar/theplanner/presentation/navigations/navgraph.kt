package com.prashannar.theplanner.presentation.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.prashannar.theplanner.presentation.FirstScreen
import com.prashannar.theplanner.presentation.StoryScreen
import com.prashannar.theplanner.presentation.TodoDisplay

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController =navController, startDestination = Screens.FirstScreen.route){
        composable(route = Screens.FirstScreen.route){
            FirstScreen(navController = navController)
        }

        composable(route = Screens.TodoDisplay.route){
            TodoDisplay(navController = navController)
        }

        composable(route = Screens.StoryScreen.route){
            StoryScreen()
        }
    }

}