package com.wahidabd.composeui.presentation.screen.search

import android.annotation.SuppressLint
import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.wahidabd.composeui.R
import com.wahidabd.composeui.presentation.common.content.EmptyContent
import com.wahidabd.composeui.presentation.common.content.ListContentProduct
import com.wahidabd.composeui.presentation.component.SearchViewBar
import org.koin.androidx.compose.koinViewModel


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SearchScreen(
    modifier: Modifier = Modifier,
    viewModel: SearchViewModel = koinViewModel()
) {

    val searchQuery by viewModel.searchQuery
    val products by viewModel.searchProductList.collectAsState()

    Scaffold {
        Column(
            modifier = modifier.fillMaxSize()
        ) {
            SearchViewBar(
                query = searchQuery,
                hint = stringResource(id = R.string.search_store),
                onValueChange = {
                    viewModel.apply {
                        updateSearchQuery(query = it)
                        searchProduct(query = it)
                    }
                },
                onClickSearch = {
                    viewModel.searchProduct(query = it)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            if (searchQuery.isNotEmpty()) ListContentProduct(
                title = "",
                products = products,
                navController = rememberNavController(),
                clickToCart = {}
            )
            else EmptyContent()
        }
    }

}