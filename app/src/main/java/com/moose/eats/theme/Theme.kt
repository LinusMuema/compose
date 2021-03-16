package com.moose.eats.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


@Composable
fun EatsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) dark else light
    MaterialTheme(colors = colors, shapes = shapes, content = content)
}