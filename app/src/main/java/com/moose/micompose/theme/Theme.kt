package com.moose.micompose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) Colors.dark else Colors.light
    MaterialTheme(colors = colors, typography = typography, shapes = shapes, content = content)
}