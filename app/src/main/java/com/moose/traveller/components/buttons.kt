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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.HorizontalGradient
import androidx.compose.ui.unit.dp
import com.moose.traveller.theme.blue300
import com.moose.traveller.theme.blue500
import com.moose.traveller.theme.red400

@Composable
fun SplashButton(text: String, modifier: Modifier = Modifier, click: () -> Unit){
    val background = Black.copy(0.7f)
    Box(modifier = modifier.padding(10.dp).clip(shapes.large).background(background)
        .clickable(onClick = { click() })) {

        Text(text = text, style = typography.h5, color = White, modifier = Modifier
            .align(Alignment.Center)
            .padding(vertical = 8.dp))
    }

}

@Composable
fun AuthButton(text: String, click: () -> Unit){
    Button(
        shape = shapes.large,
        onClick = { click() },
        modifier = Modifier.fillMaxWidth().padding(20.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = red400)
    ) {

        Text(text = text, style = typography.h5, color = White, modifier = Modifier.padding(5.dp))
    }
}

@Composable
fun SocialButton(click: () -> Unit){
    Box(
        modifier = Modifier.clip(shapes.large).fillMaxWidth()
            .drawBehind(onDraw = {
                drawRect(brush = Brush.horizontalGradient(
                    listOf(blue500, blue300), 0.0f, size.width)
                )
            })
            .clickable(onClick = { click() })
    ) {
        Text(text = "Continue with Facebook", style = typography.h5, color = White, modifier = Modifier
            .align(Alignment.Center)
            .padding(vertical = 12.dp))
    }
}