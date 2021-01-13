package com.moose.traveller

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moose.traveller.activities.Splash

@Composable
fun TravellerApp(){
    val controller = rememberNavController()

    NavHost(navController = controller, startDestination = "splash" ){
        composable("splash"){ Splash(controller) }
    }
}