package com.moose.traveller.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SplashButton(text: String){
    Box(modifier = Modifier.clip(MaterialTheme.shapes.medium)) {
        Text(text = text, color = Color.White)
    }
}

@Preview
@Composable
fun PreviewButton(){
    SplashButton(text = "Log in")
}