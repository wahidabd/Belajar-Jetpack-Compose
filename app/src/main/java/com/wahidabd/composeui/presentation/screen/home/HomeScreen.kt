package com.wahidabd.composeui.presentation.screen.home

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.wahidabd.composeui.R
import com.wahidabd.composeui.data.repository.model.ProductItem
import com.wahidabd.composeui.presentation.common.content.ListContentProduct
import com.wahidabd.composeui.presentation.component.SearchViewBar
import com.wahidabd.composeui.presentation.component.SliderBanner
import com.wahidabd.composeui.ui.navigation.screen.Screen
import com.wahidabd.composeui.ui.theme.GilroyFontFamily
import com.wahidabd.composeui.ui.theme.GrayThirdTextColor
import com.wahidabd.composeui.ui.theme.TEXT_SIZE_12sp
import com.wahidabd.composeui.utils.showToastShort
import org.koin.androidx.compose.koinViewModel


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@ExperimentalPagerApi
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    viewModel: HomeViewModel = koinViewModel()
) {

    val context = LocalContext.current
    val searchQuery by viewModel.searchQuery
    val allProducts by viewModel.productList.collectAsState()

    Scaffold { padding ->
        Column(
            modifier = modifier
                .verticalScroll(rememberScrollState())
                .padding(padding)
        ) {
            SearchViewBar(
                hint = stringResource(id = R.string.search_store),
                query = searchQuery,
                onValueChange = { if (it.isNotEmpty()) navController.navigate(Screen.Search.route) }
            )

            SliderBanner()

            ListContentProduct(
                title = stringResource(id = R.string.exclusive_offer),
                products = allProducts,
                navController = navController,
                clickToCart = { item ->
                    clickToCart(context, item, viewModel)
                }
            )

            Spacer(modifier = Modifier.height(24.dp))

            ListContentProduct(
                title = stringResource(id = R.string.best_selling),
                products = allProducts.sortedByDescending { it.id },
                navController = navController,
                clickToCart = { item ->
                    clickToCart(context, item, viewModel)
                }
            )
        }
    }
}

fun clickToCart(context: Context, productItem: ProductItem, viewModel: HomeViewModel) {
    context.showToastShort("Success Add To Cart ${productItem.title}")
    viewModel.addCart(productItem.copy(isCart = true))
}