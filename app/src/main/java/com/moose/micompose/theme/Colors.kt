package com.moose.micompose.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

object Colors {
    private val black500 = Color(0xff3e4753)
    private val black600 = Color(0xff17202a)
    private val black700 = Color(0xff000000)

    val dark = darkColors(
            primary = black600,
            primaryVariant = black700,
            onPrimary = Color.White,
            secondary = black500,
            onSecondary = Color.White
    )

    val light = lightColors(
            primary = Color.White,
            onPrimary = Color.Black,
    )
}