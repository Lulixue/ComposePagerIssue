package com.example.composepagerissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup

class PagerViewActivity : BaseActionBarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TestViewPager(this).apply {
          layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        })
    }

}