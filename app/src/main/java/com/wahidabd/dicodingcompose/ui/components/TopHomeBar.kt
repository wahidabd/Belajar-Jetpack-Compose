package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.wahidabd.dicodingcompose.core.Constant
import com.wahidabd.dicodingcompose.ui.theme.Dark

@Composable
fun TopHomeBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Halo Wahid",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp
                )
            )
            Text(
                text = "What would you like to learn today?",
                style = MaterialTheme.typography.bodySmall.copy(color = Dark)
            )
        }
        Image(
            painter = rememberAsyncImagePainter(Constant.SMALL_LOGO),
            contentDescription = "Logo",
            modifier = Modifier
                .width(38.dp)
                .height(38.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopHomeBarPreview() {
    TopHomeBar()
}