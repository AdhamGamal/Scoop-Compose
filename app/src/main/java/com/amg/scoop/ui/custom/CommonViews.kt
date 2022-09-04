package com.amg.scoop.ui.custom

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun CustomText(
    text: String,
    style: TextStyle,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    modifier: Modifier
) {
    Text(
        text = text,
        style = style,
        overflow = overflow,
        maxLines = maxLines,
        modifier = modifier
    )
}