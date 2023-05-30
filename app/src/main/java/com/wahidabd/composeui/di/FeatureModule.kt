package com.wahidabd.composeui.di

import com.wahidabd.composeui.data.local.ProductDatabase
import com.wahidabd.composeui.data.repository.LocalDataSource
import com.wahidabd.composeui.data.repository.Repository
import com.wahidabd.composeui.data.repository.onboarding.OnBoardingImpl
import com.wahidabd.composeui.data.repository.onboarding.OnBoardingOperations
import com.wahidabd.composeui.domain.MyInteractor
import com.wahidabd.composeui.domain.MyUseCase
import org.koin.dsl.module


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


val featureModule = module {

    single {
        val db: ProductDatabase = get()
        return@single db.productDao()
    }

    single { LocalDataSource(get()) }
    single<OnBoardingOperations> { OnBoardingImpl(get()) }
    single { Repository(get(), get()) }
    single<MyUseCase> { MyInteractor(get()) }

}