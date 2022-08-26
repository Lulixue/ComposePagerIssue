package com.example.composepagerissue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActionBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val className = this::class.simpleName
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = className
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}