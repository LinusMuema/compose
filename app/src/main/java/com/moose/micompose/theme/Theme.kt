package com.moose.micompose.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(colors = Colors.dark, typography = typography, shapes = shapes, content = content)
}