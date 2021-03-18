package com.moose.eats.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

// Common colors
val yellow200 = Color(0xffF1C40F)
val grey200 = Color(0xff696969)

// Light theme colors
val white100 = Color(0xffF0F3F4)
val white300 = Color(0xffD0D3D4)
val light = lightColors(primary = white100,background = white300)

// Dark theme colors
val black100 = Color(0xff566573)
val black300 = Color(0xff273746)
val dark = darkColors(primary = black100, background = black300)