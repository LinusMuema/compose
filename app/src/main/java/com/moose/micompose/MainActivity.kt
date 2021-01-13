package com.moose.micompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.core.view.WindowCompat
import com.moose.micompose.theme.AppTheme
import com.moose.micompose.ui.BodyContent
import com.moose.micompose.ui.BodyState

class MainActivity : AppCompatActivity() {
    private var width = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        width = resources.displayMetrics.run { widthPixels / density }.toInt()
        setContent {
            AppTheme {
                Content()
            }
        }
    }

    @Composable
    fun Content() {
        val activity = remember { mutableStateOf(BodyState.HOME) }
        Box(modifier = Modifier.fillMaxSize()){
            BodyContent(activity)
        }
    }
}