package com.wahidabd.dicodingcompose.ui.views.search

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wahidabd.dicodingcompose.di.Injection
import com.wahidabd.dicodingcompose.di.ViewModelCourseFactory
import com.wahidabd.dicodingcompose.ui.components.SearchBar
import com.wahidabd.dicodingcompose.ui.views.MainViewModel
import com.wahidabd.dicodingcompose.R
import com.wahidabd.dicodingcompose.core.Resource
import com.wahidabd.dicodingcompose.ui.components.CardCourse
import com.wahidabd.dicodingcompose.ui.theme.SoftGray2
import com.wahidabd.dicodingcompose.ui.theme.White2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    navController: NavController,
    viewModel: MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelCourseFactory(
            Injection.provideCourseRepository()
        )
    ),
) {

    val listState = rememberLazyListState()

    Scaffold(
        topBar = {
            SearchField(viewModel = viewModel)
        },
        content = { paddingValues ->
            viewModel.resource.collectAsState(initial = Resource.Loading).value.let { state ->
                when (state) {
                    is Resource.Loading -> {
                        viewModel.courses()
                    }
                    is Resource.Error -> {}
                    is Resource.Success -> {
                        if (state.data.isNotEmpty()) {
                            LazyColumn(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = White2)
                                    .padding(top = paddingValues.calculateTopPadding()),
                                state = listState
                            ) {
                                items(state.data.size, key = {it}) {item ->
                                    CardCourse(
                                        modifier = Modifier.padding(
                                            start = 16.dp,
                                            end = 16.dp,
                                        ),
                                        item = state.data[item],
                                        onClick = {
                                            navController
                                        }
                                    )
                                }
                            }
                        }else{
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = White2),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(text = "Not Found")
                            }
                        }
                    }
                }
            }
        }
    )
}

@Composable
fun SearchField(viewModel: MainViewModel) {
    val query by viewModel.query
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.9f)
        ) {
            SearchBar(
                placeholder = stringResource(id = R.string.placeholder_search),
                value = query,
                onValueChange = viewModel::search,
                onClear = viewModel::removeQuery
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.1f), horizontalAlignment = Alignment.End
        ) {
            val context = LocalContext.current
            IconButton(onClick = {
                Toast.makeText(
                    context,
                    "Coming Soon",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Icon(
                    modifier = Modifier.width(24.dp),
                    painter = painterResource(id = R.drawable.ic_filter),
                    contentDescription = "Filter",
                    tint = SoftGray2
                )
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SearchScreenPreview() {
    SearchScreen(navController = rememberNavController())
}