package com.moose.traveller.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.navigation.NavHostController
import com.moose.traveller.R
import com.moose.traveller.components.Header

@Composable
fun Home(controller: NavHostController) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(imageResource(R.drawable.home), modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Header(textColor = Color.White)
    }

}