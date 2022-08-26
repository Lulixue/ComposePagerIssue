package com.example.composepagerissue

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.viewinterop.AndroidView
import com.example.composepagerissue.ui.theme.ComposePagerIssueTheme

class PagerComposeActivity : BaseActionBarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePagerIssueTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    AndroidView(factory = {
                        TestViewPager(it).apply {
                            background = ColorDrawable(Color.Blue.value.toInt())
                        }
                    }, modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}