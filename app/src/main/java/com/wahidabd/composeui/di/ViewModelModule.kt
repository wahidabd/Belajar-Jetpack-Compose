package com.wahidabd.composeui.di

import com.wahidabd.composeui.presentation.screen.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


val viewModelModule = module {
    viewModel { SplashViewModel(get()) }
}