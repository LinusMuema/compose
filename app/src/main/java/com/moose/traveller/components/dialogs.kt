package com.moose.traveller.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import java.util.*

enum class AuthType { SIGNUP, LOGIN }

@Composable
fun AuthDialog(type: AuthType, openDialog: MutableState<Boolean>, auth: MutableState<Boolean>){

    val title = type.toString().toLowerCase(Locale.ROOT).capitalize(Locale.ROOT)
    var buttonText = "Log In"
    val username = remember { mutableStateOf(TextFieldValue()) }
    val password = remember { mutableStateOf(TextFieldValue()) }
    val repeatPassword = remember { mutableStateOf(TextFieldValue()) }
    val email = remember { mutableStateOf(TextFieldValue()) }

    if (openDialog.value){
        Dialog(onDismissRequest = { openDialog.value = false }) {
            Column(modifier = Modifier.fillMaxWidth().background(Transparent).padding(20.dp)) {
                Column(modifier = Modifier.clip(shape = shapes.large).fillMaxWidth()
                    .background(White), horizontalAlignment = CenterHorizontally) {

                    Text(text = title, color = colors.onSurface, style = typography.h5, modifier = Modifier.padding(10.dp))

                    Input(placeholder = "Username", text = username, icon = Icons.Filled.Person)
                    Input(placeholder = "Password", text = password, icon = Icons.Filled.Lock)

                    if (type == AuthType.SIGNUP){
                        buttonText = "Create Account"
                        Input(placeholder = "Re-type password", text = repeatPassword, icon = Icons.Filled.Lock)
                        Input(placeholder = "E-mail", text = email, icon = Icons.Filled.Email)
                    }

                    AuthButton(text = buttonText){ auth.value = true }
                }
                AuthDivider()
                SocialButton { auth.value = true }
            }
        }
    }
}