package com.moose.traveller.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.moose.traveller.theme.grey200
import com.moose.traveller.theme.grey500

@Preview
@Composable
fun AuthDivider(){
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(color = grey200, thickness = 1.dp, modifier = Modifier.weight(2f))

        Text(
            text = "Or",
            color = grey200,
            style = typography.subtitle2,
            modifier = Modifier.weight(0.5f),
            textAlign = TextAlign.Center
        )

        Divider(color = grey200, thickness = 1.dp, modifier = Modifier.weight(2f))
    }
}