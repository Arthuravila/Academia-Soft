package com.app.academiasoft.core.di

import com.app.academiasoft.ui.home.HomeViewModel
import com.app.academiasoft.ui.manage.ManageUserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { ManageUserViewModel() }

}

private val networkModule = module {
     // single { RetrofitInitializer().createEventsApiService() }
}

private val repositoryModule = module {
     // factory { HomeRepository(get()) }
}

val appModules = listOf(viewModelModule, repositoryModule, networkModule)
