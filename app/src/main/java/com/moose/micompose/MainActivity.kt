package com.moose.micompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.FabPosition
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.moose.micompose.theme.AppTheme
import com.moose.micompose.ui.BodyContent
import com.moose.micompose.ui.BodyState
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
    fun Content() {
        val activity = remember { mutableStateOf(BodyState.HOME) }
        Scaffold(
            bodyContent = { BodyContent(activity) },
            floatingActionButton = { BottomNavigation (width = width, activity = activity) },
            floatingActionButtonPosition = FabPosition.End
        )
    }

    @Preview("Content")
    @Composable
    fun preview() {
        Content()
    }
}