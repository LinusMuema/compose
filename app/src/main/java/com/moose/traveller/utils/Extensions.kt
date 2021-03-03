package com.moose.traveller.utils

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

fun DrawScope.horizontalGradient(colors: List<Color>) {
    drawRect(brush = Brush.horizontalGradient( colors, 0.0f, size.width))
}

fun DrawScope.verticalGradient(colors: List<Color>) {
    drawRect(brush = Brush.verticalGradient( colors, 0.0f, size.width))
}