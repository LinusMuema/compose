package com.moose.traveller.utils

import android.app.Activity
import android.view.View
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

fun Activity.hideBottomBar(){
    window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
}

fun DrawScope.horizontalGradient(colors: List<Color>) {
    drawRect(brush = Brush.horizontalGradient( colors, 0.0f, size.width))
}

fun DrawScope.verticalGradient(colors: List<Color>) {
    drawRect(brush = Brush.verticalGradient( colors, 0.0f, size.width))
}