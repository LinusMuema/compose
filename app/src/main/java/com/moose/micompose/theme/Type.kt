package com.moose.micompose.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.moose.micompose.R

// Set of Material typography styles to start with
val nunito = fontFamily(font(R.font.regular, FontWeight.Normal), font(R.font.light, FontWeight.Light), font(R.font.bold, FontWeight.Bold))
val typography = Typography(
        h3 = TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
        ),
        h4 = TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
        ),
        h5 = TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
        ),
        button = TextStyle(
                fontFamily = nunito,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
        )
)