package com.moose.micompose.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

object Colors {
    private val green500 = Color(0x4c9966)
    private val green600 = Color(0xff186A3B)
    private val green700 = Color(0xff003e14)
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
            primary = green600,
            primaryVariant = green700,
            onPrimary = Color.White,
            secondary = green500,
            secondaryVariant = green700,
            onSecondary = Color.White
    )
}