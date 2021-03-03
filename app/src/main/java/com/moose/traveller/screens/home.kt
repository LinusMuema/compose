package com.moose.traveller.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moose.traveller.R.drawable.home
import com.moose.traveller.components.Header
import com.moose.traveller.components.Slide
import com.moose.traveller.data.Countries
import com.moose.traveller.theme.typography

@Preview
@Composable
fun Home() {
    val countries = remember { Countries.getData() }

    Box {
        Image(
            painter = painterResource(id = home),
            modifier = Modifier.fillMaxSize(),
            contentScale = Crop,
            contentDescription = null
        )

        Column(modifier = Modifier.fillMaxSize().background(Transparent)) {
            // Header Text and caption
            Header(textColor = White)

            // The countries' slides
            Box(modifier = Modifier.fillMaxHeight(fraction = 0.9f).fillMaxWidth().padding(vertical = 10.dp)){
                LazyRow(modifier = Modifier) {
                    items(countries) {
                        Slide(country = it)
                    }
                }
            }

            // Indicators section
            Box(modifier = Modifier.fillMaxWidth().padding(10.dp)){
                // TODO: Add indicators
                Text(
                    text = "Indicators",
                    modifier = Modifier.align(Alignment.Center),
                    color = White
                )
            }
        }
    }

}