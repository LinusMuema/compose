package com.moose.traveller.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.moose.traveller.components.NavIcon
import com.moose.traveller.screens.*
import com.moose.traveller.theme.TravellerTheme
import com.moose.traveller.theme.grey300
import com.moose.traveller.theme.grey500
import com.moose.traveller.utils.hideBottomBar
import com.moose.traveller.utils.currentRoute
import com.moose.traveller.utils.getNavItems

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
        composable("home"){ Home() }
        composable("photos"){ Photos() }
        composable("explore"){ Explore() }
        composable("activity"){ Activity() }
        composable("profile"){ Profile() }
    }
}

@Composable
fun NavBar(controller: NavHostController){
    val current = currentRoute(controller)
    val selected = if (current == "home") Color.White else Color.Black

    BottomNavigation(elevation = 0.dp, backgroundColor = Color.Transparent) {
        getNavItems().forEach {
            BottomNavigationItem(
                icon = { NavIcon(icon = it.icon) },
                label = { Text("") },
                alwaysShowLabels = false,
                selected = current == it.route,
                selectedContentColor = selected,
                unselectedContentColor = grey300,
                onClick = { controller.navigate(it.route) }
            )
        }
    }
}