package com.example.apollonianlikescreensaver

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        Handler(Looper.getMainLooper()).postDelayed({
            kotlin.run {
                val i = Intent(this, MainActivity2::class.java)
                startActivity(i)
                finish()
            }
        }, 30 * 1000)
    }
}