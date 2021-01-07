package com.moose.micompose.ui

import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

enum class BodyState {HOME, LOCATION, FAVORITES, SETTINGS}

@Composable
fun BodyContent(state: MutableState<BodyState>){
    when(state.value){
        BodyState.HOME -> HomeContent()
        BodyState.LOCATION -> LocationContent()
        BodyState.FAVORITES -> FavoritesContent()
        BodyState.SETTINGS -> SettingsContent()
    }
}

@Composable
fun HomeContent() {
    Text(text = "Home Content")
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
