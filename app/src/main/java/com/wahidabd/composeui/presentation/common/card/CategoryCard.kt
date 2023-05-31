package com.wahidabd.composeui.presentation.common.card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wahidabd.composeui.R
import com.wahidabd.composeui.data.repository.model.CategoryItem
import com.wahidabd.composeui.ui.theme.BackgroundCategory3
import com.wahidabd.composeui.ui.theme.Black
import com.wahidabd.composeui.ui.theme.GilroyFontFamily


/**
 * Created by Wahid on 5/31/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun CategoryCard(
    modifier: Modifier = Modifier,
    categoryItem: CategoryItem,
) {
    Card(
        modifier = modifier.height(174.dp),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        colors = CardDefaults.cardColors(
            containerColor = categoryItem.background
        )
    ) {
        Column(
            modifier = Modifier
                .padding(PaddingValues(horizontal = 4.dp, vertical = 16.dp))
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp),
                painter = painterResource(id = categoryItem.image),
                contentDescription = categoryItem.title
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                text = categoryItem.title,
                fontFamily = GilroyFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Black,
                textAlign = TextAlign.Center,
            )
        }
    }
}


@Preview
@Composable
fun CategoryCardPreview() {
    CategoryCard(
        categoryItem = CategoryItem(
            title = "Fresh Fruits\n" + "& Vegetable",
            image = R.drawable.category2,
            background = BackgroundCategory3
        )
    )
}