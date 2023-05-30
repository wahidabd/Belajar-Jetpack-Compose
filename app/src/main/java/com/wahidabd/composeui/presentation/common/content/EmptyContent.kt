package com.wahidabd.composeui.presentation.common.content



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.wahidabd.composeui.R
import com.wahidabd.composeui.ui.theme.Black
import com.wahidabd.composeui.ui.theme.DIMENS_16dp
import com.wahidabd.composeui.ui.theme.DIMENS_248dp
import com.wahidabd.composeui.ui.theme.GilroyFontFamily
import com.wahidabd.composeui.ui.theme.TEXT_SIZE_18sp


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun EmptyContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.size(DIMENS_248dp),
            painter = painterResource(id = R.drawable.img_empty_content),
            contentDescription = stringResource(R.string.image_content_empty)
        )

        Spacer(modifier = Modifier.height(DIMENS_16dp))

        Text(
            modifier = modifier.fillMaxWidth(),
            text = stringResource(R.string.oops_no_data),
            fontFamily = GilroyFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = TEXT_SIZE_18sp,
            color = Black,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EmptyContentPreview() {
    EmptyContent()
}