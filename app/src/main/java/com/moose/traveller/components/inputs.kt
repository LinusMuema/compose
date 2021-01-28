package com.moose.traveller.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.moose.traveller.theme.grey200

@Composable
fun Input(placeholder: String, text: MutableState<TextFieldValue>, icon: ImageVector) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 20.dp)
            .border(BorderStroke(0.5.dp, color = grey200), shape = shapes.large))
    {
        TextField(
            value = text.value,
            textStyle = TextStyle(color = Color.Black),
            leadingIcon = { Icon(imageVector = icon) },
            placeholder = { Text(text = placeholder, style = typography.body2) },
            backgroundColor = colors.background,
            activeColor = Color.Transparent,
            inactiveColor = grey200,
            onValueChange = { text.value = it }
        )
    }
}
