package com.moose.traveller.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Header(textColor: Color){
    Box(modifier = Modifier.padding(top = 65.dp, start = 25.dp)) {
        Column {
            Text("Explore", color = textColor, style = MaterialTheme.typography.h3, modifier = Modifier.padding(bottom = 2.dp))
            Text("new amazing countries", color = textColor, style = MaterialTheme.typography.subtitle1)
        }
    }
}