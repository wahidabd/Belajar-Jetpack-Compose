package com.wahidabd.composeui.presentation.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun SpacerDividerContent(
    modifier: Modifier = Modifier
) {
    Spacer(modifier = modifier.height(8.dp))
    Divider(modifier = modifier.height(1.dp))
    Spacer(modifier = modifier.height(8.dp))
}