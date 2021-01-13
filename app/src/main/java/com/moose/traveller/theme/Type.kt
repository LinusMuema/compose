package com.moose.traveller.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.sp
import com.moose.traveller.R

val roboto = fontFamily(
    font(R.font.roboto_light, FontWeight.Light),
    font(R.font.roboto, FontWeight.Normal),
    font(R.font.roboto_bold, FontWeight.Bold)
)

val typography = Typography(
    body1 = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    h3 = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp
    ),
    caption = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Light,
        fontSize = 24.sp
    )
)