package com.example.usinggit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstLine: String = "first Line"
        var secondLine: String = "second Line"

        // Start in other branch
        var anotherFirstLine: String = "first line in other branch"
        var anotherSecondLine: String = "second line in other branch"
    }
}