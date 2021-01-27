package com.moose.traveller.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.Dialog
import java.util.*

enum class AuthType { SIGNUP, LOGIN }

@Composable
fun AuthDialog(type: AuthType, openDialog: MutableState<Boolean>){
    val title = type.toString().toLowerCase(Locale.ROOT).capitalize(Locale.ROOT)
    if (openDialog.value){
        Dialog(onDismissRequest = { openDialog.value = false }, content = {
            Card(shape = MaterialTheme.shapes.large, modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.fillMaxWidth().background(Color.White)) {
                    Text(text = title, color = MaterialTheme.colors.onSurface)
                }
            }
        })
    }
}