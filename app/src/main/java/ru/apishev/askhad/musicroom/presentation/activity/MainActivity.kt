package ru.apishev.askhad.musicroom.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deezer.sdk.model.Playlist
import ru.apishev.askhad.musicroom.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)
    }
}
