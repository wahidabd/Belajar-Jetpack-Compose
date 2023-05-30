package com.wahidabd.composeui.presentation.component

import android.widget.RatingBar
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.wahidabd.composeui.R
import kotlin.math.ceil
import kotlin.math.floor


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Double = 0.0,
    stars: Int = 5,
    starsColor: Color = Color.Yellow
) {
    val filledStars = floor(rating).toInt()
    val unfilledStars = (stars - ceil(rating).toInt())
    val halfStar = !(rating.rem(1).equals(0.0))

    Row(
        modifier = modifier
    ) {
        repeat(filledStars) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star),
                contentDescription = null,
                tint = starsColor
            )
        }

        if (halfStar) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star_half),
                contentDescription = null,
                tint = starsColor
            )
        }

        repeat(unfilledStars) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star_outline),
                contentDescription = null,
                tint = starsColor
            )
        }
    }
}


@Preview
@Composable
fun RatingBarPreview() {
    RatingBar(rating = 3.6)
}