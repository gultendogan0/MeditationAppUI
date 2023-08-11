@file:OptIn(ExperimentalFoundationApi::class)

package com.example.meditationappui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(route = Screen.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route + "/{featureName}",
            arguments = listOf(navArgument("featureName"){
                type = NavType.StringType
                defaultValue = "Sleep meditation"
                nullable = true
            })
        ){ entry->
            DetailScreen(featureName = entry.arguments?.getString("featureName"))
        }
    }
}


