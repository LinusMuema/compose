package com.moose.traveller.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
        Image(
            imageResource(R.drawable.splash), modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier
            .align(Alignment.TopStart)
            .padding(top = 65.dp, start = 25.dp)) {
            Text(
                "Explore",
                color = Color.Black,
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(bottom = 2.dp)
            )
            Text(
                "new amazing countries",
                color = Color.Black,
                style = MaterialTheme.typography.caption
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            SplashButton(text = "Log In"){
                dialogType.value = AuthType.LOGIN
                openDialog.value = true
            }
            SplashButton(text = "Sign Up"){
                dialogType.value = AuthType.SIGNUP
                openDialog.value = true
            }
        }
    }
}
