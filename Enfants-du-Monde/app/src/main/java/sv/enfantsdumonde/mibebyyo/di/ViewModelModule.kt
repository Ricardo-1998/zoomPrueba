package sv.enfantsdumonde.mibebyyo.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import sv.enfantsdumonde.mibebyyo.ui.main.home.HomeViewModel

val viewModelModule = module {

    viewModel {
        HomeViewModel()
    }

}