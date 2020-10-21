package com.moose.micompose.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MiComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = MiColors()
    MaterialTheme(
            colors = if (darkTheme) colors.dark else colors.light,
            typography = MiTypography,
            shapes = MiShapes,
            content = content
    )
}