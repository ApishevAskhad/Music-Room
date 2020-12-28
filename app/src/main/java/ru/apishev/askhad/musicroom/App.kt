package ru.apishev.askhad.musicroom

import android.app.Application
import ru.apishev.askhad.musicroom.di.DaggerAppComponent

internal class App : Application() {
    val appComponent = DaggerAppComponent.create()
}
