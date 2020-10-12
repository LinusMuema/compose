package com.moose.micompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.EmphasisAmbient
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideEmphasis
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.moose.micompose.ui.MiComposeTheme
import com.moose.micompose.ui.typography

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column {
                    MiLayout()
                    MiCard()
                }
            }
        }
    }

    @Composable fun MiLayout(){
        val header = imageResource(id = R.drawable.header)
        val headerPrefs = Modifier.preferredHeight(180.dp).fillMaxWidth().clip(shape = RoundedCornerShape(4.dp))
        val typography = MaterialTheme.typography
        Column (modifier = Modifier.padding(20.dp)){
            Image(header, modifier = headerPrefs, contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.preferredHeight(20.dp))
            Text(text = "Today I woke up happy", style = typography.body1)
            Text(text = "So I decided to make a pizza", style = typography.body2)
            Text(text = "But I had no ingredients. smh", style = typography.caption)
        }
    }

    @Composable fun MiCard(modifier: Modifier = Modifier){
        Row(modifier.padding(5.dp).clip(RoundedCornerShape(5.dp)).clickable(onClick = {}).padding(10.dp)) {
            Surface(modifier.preferredSize(50.dp), shape = CircleShape, color = MaterialTheme.colors.onSurface) {

            }
            Column(modifier.padding(5.dp).align(Alignment.CenterVertically).clickable(onClick = {})){
                Text(text = "Linus Moose", fontWeight = FontWeight.Bold)
                ProvideEmphasis(EmphasisAmbient.current.medium ) {
                    Text(text = "Android developer", style = typography.caption)
                }
            }
        }
    }


    @Preview
    @Composable
    fun preview(){
        Column {
            MiLayout()
            MiCard()
        }
    }
}