package com.moose.traveller.screens

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.SpaceEvenly
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moose.traveller.R
import com.moose.traveller.activities.NavigationActivity
import com.moose.traveller.components.AuthDialog
import com.moose.traveller.components.AuthType
import com.moose.traveller.components.Header
import com.moose.traveller.components.SplashButton

@Composable
fun Splash() {
    val openDialog = remember { mutableStateOf(false) }
    val authSuccess = remember { mutableStateOf(false) }
    val dialogType = remember { mutableStateOf(AuthType.LOGIN) }
    val context = LocalContext.current
    
    AuthDialog(type = dialogType.value, openDialog = openDialog, auth = authSuccess)

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.splash),
            modifier = Modifier.fillMaxSize(),
            contentScale = Crop,
            contentDescription = null
        )

        Header(Black)

        Row(modifier = Modifier
            .fillMaxWidth()
            .align(BottomCenter)
            .padding(vertical = 10.dp), horizontalArrangement = SpaceEvenly) {
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

    if (authSuccess.value){
        context.startActivity(Intent(context, NavigationActivity::class.java))
    }
}
