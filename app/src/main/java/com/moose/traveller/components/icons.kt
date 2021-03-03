package com.moose.traveller.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun NavIcon(@DrawableRes icon: Int){
    Icon(
        modifier = Modifier.requiredSize(24.dp),
        painter = painterResource(id = icon),
        contentDescription = null
    )
}