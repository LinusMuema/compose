package com.moose.traveller.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun TravellerTheme(content: @Composable () -> Unit) {
    MaterialTheme(colors = colors, typography = typography, shapes = shapes, content = content)
}