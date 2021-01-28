package com.moose.traveller.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moose.traveller.theme.red400

@Composable
fun SplashButton(text: String, modifier: Modifier = Modifier, click: () -> Unit){
    Box(modifier = modifier
        .padding(10.dp)
        .clip(shapes.large)
        .background(Black.copy(alpha = 0.7f))
        .clickable(onClick = { click() })) {

        Text(text = text, style = typography.h5, color = White, modifier = Modifier
            .align(Alignment.Center)
            .padding(vertical = 8.dp))
    }

}

@Composable
fun AuthButton(text: String){
    Button(
        onClick = { print("clicked") },
        shape = shapes.large,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        colors = ButtonConstants.defaultButtonColors(backgroundColor = red400)
    ) {

        Text(text = text, style = typography.h5, color = White, modifier = Modifier.padding(5.dp))
    }
}

@Preview
@Composable
fun preview(){
    SplashButton(text = "Log In", click = { print("login") })
}