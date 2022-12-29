package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.ui.theme.Blue
import com.wahidabd.dicodingcompose.ui.theme.Dark

@Composable
fun Level(level: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = R.drawable.ic_level),
            modifier = Modifier
                .width(16.dp)
                .size(24.dp),
            tint = Blue,
            contentDescription = "level"
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = level,
            style = MaterialTheme.typography.labelSmall.copy(
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                color = Dark,
                lineHeight = 0.sp
            )
        )
    }
}