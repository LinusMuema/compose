package com.moose.traveller.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.moose.traveller.screens.Home
import com.moose.traveller.theme.TravellerTheme
import com.moose.traveller.utils.hideBottomBar

class NavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.hideBottomBar()
        setContent {
            val controller: NavHostController = rememberNavController()
            TravellerTheme {
                Scaffold(
                    bodyContent = { Body(controller = controller) },
                    bottomBar = { NavBar(controller = controller) }
                )
            }
        }
    }
}

@Composable
fun Body(controller: NavHostController){
    NavHost(navController = controller, startDestination = "home"){
        composable("home"){ Home(controller = controller) }
    }
}

@Composable
fun NavBar(controller: NavHostController){

}