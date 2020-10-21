package com.moose.micompose.ui

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val blue600 = Color(0xff0277bd)
val blue700 = Color(0xff004c8c)
val black500 = Color(0xff3e4753)
val black600 = Color(0xff17202a)
val black700 = Color(0xff000000)

open class MiColors {
    val light = lightColors(
            primary = blue600,
            primaryVariant = blue700,
            onPrimary = Color.White,
            secondary = blue600,
            secondaryVariant = blue700,
            onSecondary = Color.White
    )

    val dark = darkColors(
            primary = black600,
            primaryVariant = black700,
            onPrimary = Color.White,
            secondary = black500,
            onSecondary = Color.White
    )
}