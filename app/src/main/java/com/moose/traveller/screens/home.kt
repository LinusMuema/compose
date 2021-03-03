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
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.moose.traveller.R.drawable.home
import com.moose.traveller.components.Header
import com.moose.traveller.components.Slide
import com.moose.traveller.data.Countries

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

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Transparent),
            verticalArrangement = Arrangement.SpaceAround
        ) {

            Box(modifier = Modifier
                .weight(1f)){
                Header(textColor = White)
            }

            Box(modifier = Modifier.weight(3f, fill = true)){
                LazyRow(modifier = Modifier) {
                    items(countries) {
                        Slide(country = it)
                    }
                }
            }

            Box(modifier = Modifier
                .weight(1f)
                .fillMaxWidth()){
                Text(text = "Indicators", modifier = Modifier.align(Alignment.Center))
            }
        }
    }

}