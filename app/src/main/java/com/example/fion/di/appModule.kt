package com.example.fion.di

import com.example.fion.data.repository.DefatulManagerInfoRepository
import com.example.fion.data.repository.ManagerInfoRepository
import com.example.fion.screen.playersearch.PlayerSearchViewModel
import com.example.fion.screen.managerinfo.ManagerInfoViewModel
import com.example.fion.util.provider.DefaultResourcesProvider
import com.example.fion.util.provider.ResourceProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { ManagerInfoViewModel() }
    viewModel { PlayerSearchViewModel() }

    single<ManagerInfoRepository> { DefatulManagerInfoRepository(get(), get()) }

    single { provideGsonConvertFactory() }
    single { buildOkHttpClient() }

    single { provideRetrofit(get(), get()) }

    single<ResourceProvider> { DefaultResourcesProvider(androidApplication()) }

    single { Dispatchers.IO }
    single { Dispatchers.Main }

}