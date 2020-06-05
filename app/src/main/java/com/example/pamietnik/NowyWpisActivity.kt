package com.example.pamietnik
import android.view.Menu
import android.view.MenuItem

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class NowyWpisActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nowy_wpis)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
    }
}