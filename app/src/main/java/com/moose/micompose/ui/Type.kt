package com.moose.micompose.ui

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.moose.micompose.R

val montserrat = fontFamily(font(R.font.montserrat))
val raleway = fontFamily(font(R.font.regular, FontWeight.W500), font(R.font.bold, FontWeight.W600))

val MiTypography = Typography(
        h3 = TextStyle(
                fontFamily = raleway,
                fontWeight = FontWeight.W600,
                fontSize = 16.sp,
        ),
        h4 = TextStyle(
                fontFamily = raleway,
                fontWeight = FontWeight.W600,
                fontSize = 14.sp
        ),
        button = TextStyle(
                fontFamily = montserrat,
                fontWeight = FontWeight.W500,
                fontSize = 14.sp
        ),
        caption = TextStyle(
                fontFamily = raleway,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp
        )
)