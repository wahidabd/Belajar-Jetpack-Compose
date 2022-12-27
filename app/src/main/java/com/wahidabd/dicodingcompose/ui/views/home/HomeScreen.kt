package com.wahidabd.dicodingcompose.ui.views.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wahidabd.dicodingcompose.ui.components.SearchBar
import com.wahidabd.dicodingcompose.ui.components.TopHomeBar
import com.wahidabd.dicodingcompose.ui.theme.White2
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.navigation.Routes
import com.wahidabd.dicodingcompose.ui.components.CategoryCourse

@Composable
fun HomeScreen(
    paddingValues: PaddingValues,
    navController: NavController
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = White2)
    ) {
        item {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                TopHomeBar()
                Spacer(modifier = Modifier.height(16.dp))
                SearchBar(
                    placeholder = stringResource(id = R.string.placeholder_search),
                    value = "",
                    enable = false,
                    onClick = {
                        navController.navigate(Routes.Search.route)
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
                CategoryCourse()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview() {
    Scaffold {
        HomeScreen(paddingValues = it, navController = rememberNavController())
    }
}