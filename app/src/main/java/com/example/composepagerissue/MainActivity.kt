package com.example.composepagerissue

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composepagerissue.ui.theme.ComposePagerIssueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePagerIssueTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Column(modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Button(onClick = {
                            startActivity(Intent(this@MainActivity, PagerViewActivity::class.java))
                        }) {
                            Text(text = "ViewPager in view")
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Button(onClick = {
                            startActivity(Intent(this@MainActivity, PagerComposeActivity::class.java))
                        }) {
                            Text(text = "ViewPager in compose")
                        }
                    }
                }
            }
        }
    }
}
