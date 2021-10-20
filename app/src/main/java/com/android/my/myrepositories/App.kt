package com.android.my.myrepositories

import android.app.Application
import com.android.my.myrepositories.data.di.DataModule
import com.android.my.myrepositories.domain.di.DomainModule
import com.android.my.myrepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}