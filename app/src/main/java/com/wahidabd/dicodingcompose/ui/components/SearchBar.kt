package com.wahidabd.dicodingcompose.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.wahidabd.dicodingcompose.ui.theme.SoftGray
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.ui.theme.Blue
import com.wahidabd.dicodingcompose.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    placeholder: String,
    value: String,
    enable: Boolean = true,
    onClick: () -> Unit = {},
    onValueChange: (String) -> Unit = {},
    onClear: () -> Unit = {}
) {

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(54.dp)
            .clickable {
                onClick()
            },
        value = value,
        enabled = enable,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = White,
            unfocusedBorderColor = White,
            focusedBorderColor = SoftGray,
            cursorColor = Blue
        ),
        shape = RoundedCornerShape(12.dp),
        maxLines = 1,
        singleLine = true,
        textStyle = TextStyle(
            fontWeight = FontWeight.Medium,
        ),
        leadingIcon = {
            Icon(
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search Icon"
            )
        },
        trailingIcon = {
            if (value.length > 3) {
                Icon(
                    modifier = Modifier.clickable {
                        onClear()
                    },
                    painter = painterResource(id = R.drawable.ic_baseline_cancel_24),
                    contentDescription = "cancel",
                    tint = SoftGray
                )
            }
        },
        onValueChange = onValueChange,
        placeholder = {
            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = placeholder,
                    style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Normal)
                )
            }
        },
    )
}