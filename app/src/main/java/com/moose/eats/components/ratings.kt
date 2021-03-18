package com.moose.eats.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moose.eats.R
import com.moose.eats.theme.grey200
import com.moose.eats.theme.yellow200
import kotlin.math.floor

@Composable
fun Rating(rating: Double){
    val limit = floor(rating)
    Row {
        (1..5).forEach {
            var icon = painterResource(id = R.drawable.ic_rating_outline)
            var color = Color.Black
            if (it <= limit){
                icon = painterResource(id = R.drawable.ic_rating_filled)
                color = yellow200
            }

           Icon(
               painter = icon,
               contentDescription = "rating",
               modifier = Modifier.width(10.dp).padding(1.dp),
               tint = color
           )
        }
    }
}