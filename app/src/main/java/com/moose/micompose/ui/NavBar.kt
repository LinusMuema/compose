package com.moose.micompose.ui

import androidx.compose.animation.core.TransitionState
import androidx.compose.foundation.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawOpacity
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.moose.micompose.R
import com.moose.micompose.theme.iconOpacity
import com.moose.micompose.theme.width

@Composable
fun NavBar(navState: MutableState<NavState>, state: TransitionState, activity: MutableState<BodyState>){
    Row(
        modifier = Modifier.size(state[width], 60.dp)
            .background(color = MaterialTheme.colors.primary, shape = MaterialTheme.shapes.medium),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        NavBarContent(navState = navState, state = state, activity = activity)
    }
}

@Composable
fun NavBarContent(navState: MutableState<NavState>, state: TransitionState, activity: MutableState<BodyState>){
    if (navState.value == NavState.OPEN){
            Icon(
                asset = vectorResource(id = R.drawable.ic_home),
                modifier = Modifier.size(24.dp).drawOpacity(state[iconOpacity])
                    .clickable(onClick = {
                        activity.value = BodyState.HOME
                        navState.value = if (navState.value == NavState.OPEN) NavState.CLOSED else NavState.OPEN
                }),
                tint = MaterialTheme.colors.onPrimary
            )
        Icon(
            asset = vectorResource(id = R.drawable.ic_location),
            modifier = Modifier.size(24.dp).drawOpacity(state[iconOpacity])
                .clickable(onClick = {
                    activity.value = BodyState.LOCATION
                    navState.value = if (navState.value == NavState.OPEN) NavState.CLOSED else NavState.OPEN
                }),
            tint = MaterialTheme.colors.onPrimary
        )
        Icon(
            asset = vectorResource(id = R.drawable.ic_favorites),
            modifier = Modifier.size(24.dp).drawOpacity(state[iconOpacity])
                .clickable(onClick = {
                    activity.value = BodyState.FAVORITES
                    navState.value = if (navState.value == NavState.OPEN) NavState.CLOSED else NavState.OPEN
                }),
            tint = MaterialTheme.colors.onPrimary
        )
        Icon(
            asset = vectorResource(id = R.drawable.ic_settings),
            modifier = Modifier.size(24.dp).drawOpacity(state[iconOpacity])
                .clickable(onClick = {
                    activity.value = BodyState.SETTINGS
                    navState.value = if (navState.value == NavState.OPEN) NavState.CLOSED else NavState.OPEN
                }),
            tint = MaterialTheme.colors.onPrimary
        )
    }
    else {
        Icon(
            asset = vectorResource(id = R.drawable.ic_menu),
            modifier = Modifier.size(24.dp).clickable(onClick = {
                navState.value = if (navState.value == NavState.OPEN) NavState.CLOSED else NavState.OPEN
            }),
            tint = MaterialTheme.colors.onPrimary
        )
    }
}