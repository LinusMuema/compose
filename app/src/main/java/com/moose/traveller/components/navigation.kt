package com.moose.traveller.components

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.KEY_ROUTE
import androidx.navigation.compose.currentBackStackEntryAsState
import com.moose.traveller.R

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.arguments?.getString(KEY_ROUTE)
}

data class NavItem(val route: String, @DrawableRes val icon: Int)

fun getNavItems(): List<NavItem> = listOf(
    NavItem("home", R.drawable.ic_home),
    NavItem("photos", R.drawable.ic_photos),
    NavItem("explore", R.drawable.ic_explore),
    NavItem("activity", R.drawable.ic_activity),
    NavItem("profile", R.drawable.ic_profile)
)