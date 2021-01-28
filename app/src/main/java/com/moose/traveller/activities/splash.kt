package com.moose.traveller.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceEvenly
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moose.traveller.R
import com.moose.traveller.components.AuthDialog
import com.moose.traveller.components.AuthType
import com.moose.traveller.components.SplashButton

@Preview
@Composable
fun Splash() {
    val openDialog = remember { mutableStateOf(false) }
    val dialogType = remember { mutableStateOf(AuthType.LOGIN) }
    
    AuthDialog(type = dialogType.value, openDialog = openDialog)

    Box(modifier = Modifier.fillMaxSize()) {
        Image(imageResource(R.drawable.splash), modifier = Modifier.fillMaxSize(), contentScale = Crop)

        Column(modifier = Modifier.align(TopStart).padding(top = 65.dp, start = 25.dp)) {
            Text("Explore", color = Black, style = typography.h3, modifier = Modifier.padding(bottom = 2.dp))
            Text("new amazing countries", color = Black, style = typography.subtitle1)
        }

        Row(modifier = Modifier.fillMaxWidth().align(BottomCenter).padding(vertical = 10.dp), horizontalArrangement = SpaceEvenly) {
            SplashButton(text = "Log In", modifier = Modifier.weight(1f)){
                dialogType.value = AuthType.LOGIN
                openDialog.value = true
            }
            Spacer(modifier = Modifier)
            SplashButton(text = "Sign Up", modifier = Modifier.weight(1f)){
                dialogType.value = AuthType.SIGNUP
                openDialog.value = true
            }
        }
    }
}
