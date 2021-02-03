package com.moose.traveller.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.moose.traveller.R
import com.moose.traveller.R.drawable.home
import com.moose.traveller.components.Header
import com.moose.traveller.data.Countries

@Composable
fun Home() {
    val countries = remember { Countries.getData() }

    Box {
        Image(imageResource(home), modifier = Modifier.fillMaxSize(), contentScale = Crop)
        Column(
            modifier = Modifier.fillMaxSize().background(Transparent),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Box(modifier = Modifier.padding(vertical = 10.dp).weight(1f)){
                Header(textColor = White)
            }

            Box(modifier = Modifier.padding(vertical = 10.dp).weight(4f, fill = true)){
                ScrollableRow(modifier = Modifier) {
                    countries.forEach {
                        Box(modifier = Modifier.clip(shapes.large)){
                            Image(imageResource(it.image), contentScale = Crop)
                        }
                    }
                }
            }

            Box(modifier = Modifier.padding(vertical = 40.dp).weight(1f)){
                Text(text = "Indicators", color = White)
            }
        }
    }

}