package com.wahidabd.dicodingcompose.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColorScheme(
    primary = Blue,
    primaryContainer = HonoluluBlue,
    secondary = Ruby
)

@Composable
fun DicodingComposeTheme(
    content: @Composable () -> Unit
) {
    val colors = LightColorPalette

    MaterialTheme (
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}