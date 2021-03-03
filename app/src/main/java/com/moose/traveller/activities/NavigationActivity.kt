package com.moose.traveller.activities

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.moose.traveller.components.NavIcon
import com.moose.traveller.components.currentRoute
import com.moose.traveller.components.getNavItems
import com.moose.traveller.screens.*
import com.moose.traveller.theme.TravellerTheme
import com.moose.traveller.theme.grey300

class NavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val controller: NavHostController = rememberNavController()
            TravellerTheme {
                Scaffold(
                    content = { Body(controller = controller) },
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
                alwaysShowLabel = false,
                selected = current == it.route,
                selectedContentColor = selected,
                unselectedContentColor = grey300,
                onClick = { controller.navigate(it.route){
                    popUpTo = controller.graph.startDestination
                    launchSingleTop = true
                }}
            )
        }
    }
}