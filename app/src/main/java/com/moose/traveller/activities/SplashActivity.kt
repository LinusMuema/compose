package com.moose.traveller.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moose.traveller.R
import com.moose.traveller.components.AuthDialog
import com.moose.traveller.components.AuthType
import com.moose.traveller.components.Header
import com.moose.traveller.components.SplashButton
import com.moose.traveller.screens.Splash
import com.moose.traveller.theme.TravellerTheme

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TravellerTheme {
                Scaffold(
                    content = {
                        val openDialog = remember { mutableStateOf(false) }
                        val authSuccess = remember { mutableStateOf(false) }
                        val dialogType = remember { mutableStateOf(AuthType.LOGIN) }

                        AuthDialog(type = dialogType.value, openDialog = openDialog, auth = authSuccess)

                        Box(modifier = Modifier.fillMaxSize()) {
                            Image(
                                painter = painterResource(id = R.drawable.splash),
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop,
                                contentDescription = null
                            )

                            Header(Color.Black)

                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)
                                .padding(vertical = 10.dp), horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
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
                            startActivity(Intent(this, NavigationActivity::class.java))
                            finish()
                        }
                    }
                )
            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}