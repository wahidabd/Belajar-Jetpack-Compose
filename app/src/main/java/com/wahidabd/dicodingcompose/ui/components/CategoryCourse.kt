package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.data.source.LearningPathData
import com.wahidabd.dicodingcompose.ui.theme.Dark

@Composable
fun CategoryCourse() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Learning Path",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(painter = painterResource(id = R.drawable.ic_more), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(LearningPathData.list, key = { it.id }) { item ->
                ItemCategoryCourse(icon = item.icon, name = item.name, color = item.color)
            }
        }
    }
}

@Composable
fun ItemCategoryCourse(
    icon: Int,
    name: String,
    color: Color
) {
    val source = remember { MutableInteractionSource() }
    Column(
        modifier = Modifier.clickable(
            interactionSource = source,
            indication = null
        ) {},
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Card(
            shape = RoundedCornerShape(percent = 100),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Icon(
                modifier = Modifier
                    .padding(18.dp)
                    .width(32.dp)
                    .height(32.dp),
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = color
            )
        }
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = name, style = MaterialTheme.typography.labelSmall.copy(
                color = Dark, fontWeight = FontWeight.SemiBold, fontSize = 12.sp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryCoursePreview() {
    CategoryCourse()
}