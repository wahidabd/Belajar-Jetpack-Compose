package com.wahidabd.composeui.di

import com.wahidabd.composeui.data.local.ProductDatabase
import org.koin.dsl.module


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


val dbModule = module {

    single {ProductDatabase.getDatabase(get())}

}