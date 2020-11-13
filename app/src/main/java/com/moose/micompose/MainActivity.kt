package com.moose.micompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.moose.micompose.theme.AppTheme
import com.moose.micompose.ui.BottomNavigation

class MainActivity : AppCompatActivity() {
    private var width = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        width = resources.displayMetrics.run { widthPixels / density }.toInt()
        setContent {
            AppTheme {
                Content()
            }
        }
    }

    @Composable
    fun Content(modifier: Modifier = Modifier) {
        AppTheme {
            Box(modifier = Modifier.fillMaxWidth().fillMaxHeight()){
                val activity = remember { mutableStateOf("Home Activity") }
                Text(text = activity.value, style = MaterialTheme.typography.h3, color = MaterialTheme.colors.onSurface, modifier = modifier.align(Alignment.Center))
                Box(modifier = modifier.align(Alignment.BottomEnd)) {
                    BottomNavigation(width, activity)
                }
            }
        }
    }

    @Preview("Content")
    @Composable
    fun preview() {
        Content()
    }
}