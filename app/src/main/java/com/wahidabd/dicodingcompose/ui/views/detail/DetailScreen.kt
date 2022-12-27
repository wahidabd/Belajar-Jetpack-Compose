package com.wahidabd.dicodingcompose.ui.views.detail

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.wahidabd.dicodingcompose.di.Injection
import com.wahidabd.dicodingcompose.di.ViewModelCourseFactory
import com.wahidabd.dicodingcompose.ui.views.MainViewModel

@Composable
fun DetailScreen(
    navController: NavController,
    id: Int,
    viewModel: MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelCourseFactory(
            Injection.provideCourseRepository()
        )
    )
) {

}