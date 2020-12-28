package ru.apishev.askhad.musicroom.di

import dagger.Component
import ru.apishev.askhad.musicroom.presentation.fragment.RegistrationFragment

@Component(modules = [RegistrationModule::class])
internal interface AppComponent {
    fun inject(fragment: RegistrationFragment)
}
