package com.prashannar.theplanner.presentation.navigations

sealed class Screens(val route: String){
    object FirstScreen: Screens(route = "FirstScreen")
    object TodoDisplay: Screens(route = "TodoDisplay")
    object StoryScreen: Screens(route = "StoryScreen")


}
