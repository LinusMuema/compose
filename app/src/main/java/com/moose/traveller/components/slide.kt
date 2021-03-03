package com.moose.traveller.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moose.traveller.data.Country

@Composable
fun Slide(country: Country){
    Box(modifier = Modifier.padding(10.dp).width(300.dp).clip(shapes.large)){

        Image(painter = painterResource(country.image), contentScale = ContentScale.FillHeight, contentDescription = null)

        Box(modifier = Modifier.fillMaxSize()){
            CountryHeader(
                name = country.name,
                caption = "3 places to visit",
                modifier = Modifier.align(Alignment.BottomStart)
            )
        }
    }
}