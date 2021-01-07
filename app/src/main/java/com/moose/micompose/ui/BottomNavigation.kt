package com.moose.micompose.ui

import androidx.compose.animation.core.transitionDefinition
import androidx.compose.animation.core.tween
import androidx.compose.animation.transition
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.moose.micompose.theme.iconOpacity

enum class NavState { OPEN, CLOSED }

@Composable
fun BottomNavigation(width: Int, activity: MutableState<BodyState>) {
    val navState = remember { mutableStateOf(NavState.CLOSED)}
    val definition = transitionDefinition<NavState> {
        state(NavState.OPEN){
            this[com.moose.micompose.theme.width] = 60.dp
            this[iconOpacity] = 0f
        }

        state(NavState.CLOSED){
            this[com.moose.micompose.theme.width] = width.dp
            this[iconOpacity] = 1f
        }

        transition(NavState.OPEN to NavState.CLOSED){
            com.moose.micompose.theme.width using tween(1000)
            iconOpacity using tween(2000)
        }

        transition(NavState.CLOSED to NavState.OPEN){
            com.moose.micompose.theme.width using tween(500)
            iconOpacity using tween(2000)
        }

    }
    val toState = if (navState.value == NavState.CLOSED) NavState.OPEN else NavState.CLOSED
    val state = transition(definition = definition, toState = toState, initState = navState.value)
    NavBar(navState = navState, state = state, activity = activity)
}