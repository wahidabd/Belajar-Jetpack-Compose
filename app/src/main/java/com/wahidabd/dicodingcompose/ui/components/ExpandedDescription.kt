package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.wahidabd.dicodingcompose.ui.theme.Dark

@Composable
fun ExpandedDescription(modifier: Modifier = Modifier, text: String) {

    var isExpanded by remember { mutableStateOf(false) }
    val textState = remember { mutableStateOf<TextLayoutResult?>(null) }
    var isClickable by remember { mutableStateOf(false) }
    var textResult by remember { mutableStateOf(text) }

    val textStateResult = textState.value
    LaunchedEffect(textStateResult) {
        if (textStateResult == null) return@LaunchedEffect

        when {
            isExpanded -> {
                textResult = "$text read more... "
            }

            !isExpanded && textStateResult.hasVisualOverflow -> {
                val lastCharIndex = textStateResult.getLineEnd(5 - 1)
                val showMoreText = "... read more"
                val adjustedText = text
                    .substring(startIndex = 0, endIndex =  lastCharIndex)
                    .dropLast(showMoreText.length)
                    .dropLastWhile { it == ' ' || it == '.'}

                textResult = "$adjustedText$showMoreText"
                isClickable = true
            }
        }
    }

    Text(
        text = textResult,
        textAlign = TextAlign.Justify,
        maxLines = if (isExpanded) Int.MAX_VALUE else 5,
        onTextLayout = { textState.value = it },
        style = MaterialTheme.typography.bodySmall.copy(
            color = Dark,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        ),
        modifier = modifier
            .clickable(
                enabled = isClickable,
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) { isExpanded = !isExpanded }
            .animateContentSize(),
    )
}