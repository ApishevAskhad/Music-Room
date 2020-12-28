package ru.apishev.askhad.musicroom.di

import dagger.Module
import dagger.Provides
import ru.apishev.askhad.musicroom.presentation.viewmodel.RegistrationViewModel

@Module
internal object RegistrationModule {
    @Provides
    @JvmStatic
    fun provideRegistrationViewModel() = RegistrationViewModel()
}
