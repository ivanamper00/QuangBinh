package com.wayneall.dongthap.android.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.wayneall.dongthap.android.main.MainActivity
import com.wayneall.dongthap.android.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(MainActivity.getStartIntent(this))
                finish()
            }, 1500
        )
    }
}