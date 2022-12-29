package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.animation.*
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wahidabd.dicodingcompose.data.model.Syllabus
import com.wahidabd.dicodingcompose.ui.theme.Dark
import com.wahidabd.dicodingcompose.ui.theme.MaximumYellowRed
import com.wahidabd.dicodingcompose.ui.theme.White

@Composable
fun CardSyllabus(item: Syllabus, onItemClick: () -> Unit, expanded: Boolean) {
    val scrollState = rememberScrollState()
    var shouldAnimate by remember { mutableStateOf(true) }
    LaunchedEffect(key1 = shouldAnimate) {
        scrollState.animateScrollTo(
            scrollState.maxValue,
            animationSpec = tween(10000, 300, easing = CubicBezierEasing(0f, 0f, 0f, 0f))
        )
        scrollState.scrollTo(0)
        shouldAnimate = !shouldAnimate
    }
    Card(
        colors = CardDefaults.cardColors(containerColor = White)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() },
                        onClick = onItemClick
                    )
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = item.title,
                        modifier = Modifier
                            .padding(end = 4.dp)
                            .weight(1f)
                            .horizontalScroll(scrollState, false),
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        style = MaterialTheme.typography.bodyMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 12.sp,
                        )
                    )
                    Time(time = item.time)
                }
            }
        }
        BodySyllabus(item = item, isExpanded = expanded)
    }
}

@Composable
fun BodySyllabus(item: Syllabus, isExpanded: Boolean) {
    val expandedTransition = remember {
        expandVertically(
            expandFrom = Alignment.Top,
            animationSpec = tween(300)
        ) + fadeIn(
            animationSpec = tween(300)
        )
    }

    val collapseTransition = remember {
        shrinkVertically(
            shrinkTowards = Alignment.Top,
            animationSpec = tween(300)
        ) + fadeOut(
            animationSpec = tween(300)
        )
    }

    AnimatedVisibility(
        visible = isExpanded,
        enter = expandedTransition,
        exit = collapseTransition
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 2.dp)
        ) {
            Text(
                text = item.body,
                textAlign = TextAlign.Justify,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = Dark
                )
            )
            Spacer(modifier = Modifier.padding(vertical = 6.dp))
            Text(
                text = item.article,
                style = MaterialTheme.typography.labelMedium.copy(
                    color = MaximumYellowRed,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 12.sp
                )
            )
        }
    }
}