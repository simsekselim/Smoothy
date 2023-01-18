package com.simsekselim.smoothy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var serviceIntent: Intent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        serviceIntent = Intent(this, MusicService::class.java)
        startService(serviceIntent)

    }

    override fun onDestroy() {
        super.onDestroy()
        stopService(serviceIntent)
    }
}