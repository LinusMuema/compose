package com.moose.traveller.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp

@Composable
fun NavIcon(@DrawableRes icon: Int){
    Icon(modifier = Modifier.preferredSize(24.dp), imageVector = vectorResource(icon))
}