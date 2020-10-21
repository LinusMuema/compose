package com.moose.micompose.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val MiShapes = Shapes(
        small = RoundedCornerShape(topRight = 30.dp, topLeft = 30.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(bottomLeft = 30.dp, bottomRight = 30.dp),
)