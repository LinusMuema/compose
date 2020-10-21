    package com.moose.micompose

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Icon
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.moose.micompose.ui.MiComposeTheme

    class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }

    @Composable
    fun Content (modifier: Modifier = Modifier) {
        MiComposeTheme {
            Column(modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween){
                Row(modifier.background(
                        color = MaterialTheme.colors.secondary,
                        shape = MaterialTheme.shapes.large)
                        .preferredHeight(100.dp)
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                    Text(
                            text = "Mi Compose",
                            modifier.align(Alignment.CenterVertically),
                            style = MaterialTheme.typography.h3,
                            color = MaterialTheme.colors.onPrimary
                    )
                }
                ScrollableColumn {
                    
                }
                Row(modifier.background(
                        color = MaterialTheme.colors.secondary,
                        shape = MaterialTheme.shapes.small)
                        .preferredHeight(50.dp)
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                        Icon(
                                Default.Home,
                                modifier.preferredSize(50.dp).padding(vertical = 10.dp),
                                tint = MaterialTheme.colors.onPrimary
                        )
                        Icon(
                                Default.ShoppingCart,
                                modifier.preferredSize(50.dp).padding(vertical = 10.dp),
                                tint = MaterialTheme.colors.onPrimary
                        )
                        Icon(
                                Default.Person,
                                modifier.preferredSize(50.dp).padding(vertical = 10.dp),
                                tint = MaterialTheme.colors.onPrimary
                        )
                }
            }
        }
    }

    @Preview(name = "Content")
    @Composable
    fun preview(){
        Content()
    }
}