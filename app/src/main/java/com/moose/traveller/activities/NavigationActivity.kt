package com.moose.traveller.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.ui.platform.setContent
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
            val controller = rememberNavController()
            TravellerTheme {
                NavHost(navController = controller, startDestination = "home"){
                    composable("home"){ Home(controller = controller) }
                }
            }
        }
    }
}