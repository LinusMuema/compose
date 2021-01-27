package com.moose.traveller.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SplashButton(text: String, click: () -> Unit){
    Box(
        modifier = Modifier
            .clip(MaterialTheme.shapes.medium)
            .background(Color.Black.copy(alpha = 0.7f))
            .padding(5.dp)
            .clickable(onClick = { click() })
    ) {
        Text(
            modifier = Modifier.padding(horizontal = 30.dp, vertical = 5.dp),
            text = text,
            style = MaterialTheme.typography.h5,
            color = Color.White
        )
    }
}

@Preview
@Composable
fun PreviewButton(){
    SplashButton(text = "Log in") { print("Clicked") }
}