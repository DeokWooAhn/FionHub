package com.example.fion.di

import com.example.fion.util.provider.DefaultResourcesProvider
import com.example.fion.util.provider.ResourceProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {

    single { provideGsonConvertFactory() }
    single { buildOkHttpClient() }

    single { provideRetrofit(get(), get()) }

    single<ResourceProvider> { DefaultResourcesProvider(androidApplication()) }

    single { Dispatchers.IO }
    single { Dispatchers.Main }

}