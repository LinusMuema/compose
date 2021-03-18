package com.moose.eats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.moose.eats.components.Rating
import com.moose.eats.data.Data
import com.moose.eats.data.Food
import com.moose.eats.theme.EatsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EatsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen(){
    val data: List<Food> = Data.getFood()
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Eats",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(20.dp)
        )
        LazyColumn {
            items(data){ food ->
                Card(
                    modifier = Modifier.fillMaxWidth().height(120.dp).padding(vertical = 10.dp, horizontal = 20.dp),
                    backgroundColor = MaterialTheme.colors.primary
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = food.image),
                            contentDescription = food.name,
                            modifier = Modifier.clip(MaterialTheme.shapes.medium)
                        )
                        Column(
                            modifier = Modifier.padding(10.dp).fillMaxHeight(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Column(modifier = Modifier.fillMaxHeight(fraction = 0.5f)) {
                                Text(
                                    text = food.name,
                                    color = MaterialTheme.colors.onSurface,
                                    style = MaterialTheme.typography.body2,
                                )
                                Rating(rating = food.rating)
                            }
                            Box(modifier = Modifier.fillMaxHeight(fraction = 0.5f)){
                                Text(
                                    text = "Price: €${food.price}",
                                    color = MaterialTheme.colors.onSurface,
                                    style = MaterialTheme.typography.body2,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}