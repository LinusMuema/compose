package com.moose.micompose.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.VerticalGradient
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.unit.dp
import com.koduok.compose.glideimage.GlideImage
import com.moose.micompose.data.City
import com.moose.micompose.data.Data

enum class BodyState {HOME, LOCATION, FAVORITES, SETTINGS}

@Composable
fun BodyContent(state: MutableState<BodyState>){
    val cities = remember { mutableStateOf(Data.cities) }

    when(state.value){
        BodyState.HOME -> HomeContent(cities.value)
        BodyState.LOCATION -> LocationContent()
        BodyState.FAVORITES -> FavoritesContent()
        BodyState.SETTINGS -> SettingsContent()
    }
}

@Composable
fun HomeContent(cities: List<City>) {
    val context = ContextAmbient.current
    LazyColumnFor(items = cities, modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 50.dp)) {
        Column(modifier = Modifier.padding(0.dp, 10.dp)) {
            val highlight = remember { mutableStateOf(it.images.random()) }
            Card(modifier = Modifier.fillMaxWidth().preferredHeight(200.dp).padding(10.dp)
                .clickable(
                    onClick = {
                        val gmmIntentUri = Uri.parse("geo:${it.lat},${it.lng}")
                        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                        mapIntent.setPackage("com.google.android.apps.maps")
                        context.startActivity(mapIntent)
                    }), shape = RoundedCornerShape(10.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()){
                    GlideImage(highlight.value, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                    Box(modifier = Modifier.fillMaxSize().background(VerticalGradient(listOf(Color.Transparent, Color.Black), 0f, 500f))){
                        Text(text = it.name, modifier = Modifier.align(Alignment.BottomStart).padding(10.dp), style = MaterialTheme.typography.h3)
                    }
                }
            }
            LazyRowFor(items = it.images){
                Card(shape = CircleShape, modifier = Modifier.padding(10.dp)) {
                    GlideImage(it,   contentScale = ContentScale.Crop,
                        modifier = Modifier.preferredSize(100.dp)
                            .clickable(onClick = { highlight.value = it })
                    )
                }
            }
        }
    }
}


@Composable
fun LocationContent() {
    Text(text = "Location Content")
}

@Composable
fun FavoritesContent() {
    Text(text = "Favorites Content")
}

@Composable
fun SettingsContent() {
    Text(text = "Settings Content")
}
