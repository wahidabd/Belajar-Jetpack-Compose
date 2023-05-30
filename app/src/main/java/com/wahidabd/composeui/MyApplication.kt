package com.wahidabd.composeui

import android.app.Application
import com.wahidabd.composeui.di.dbModule
import com.wahidabd.composeui.di.featureModule
import com.wahidabd.composeui.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level


/**
 * Created by Wahid on 5/30/2023.
 * Github github.com/wahidabd.
 */


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    dbModule,
                    featureModule,
                    viewModelModule
                )
            )
        }
    }

}