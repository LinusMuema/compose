package com.moose.traveller.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.moose.traveller.screens.Splash
import com.moose.traveller.theme.TravellerTheme
import com.moose.traveller.utils.hideBottomBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.hideBottomBar()

        setContent {
            TravellerTheme {
                Splash()
            }
        }
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}