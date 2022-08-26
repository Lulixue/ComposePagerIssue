package com.example.composepagerissue

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView

class TestViewPager(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {
    constructor(context: Context) : this(context, null)

    init {
        addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                println("onPageScrolled $position $positionOffset")
            }

            override fun onPageSelected(position: Int) {
                println("onPageSelected $position")
            }

            override fun onPageScrollStateChanged(state: Int) {
                println("onPageScrollStateChanged $state")
            }

        })
        adapter = TestAdapter()
        overScrollMode = OVER_SCROLL_ALWAYS
        setBackgroundColor(Color.Black.toArgb())
    }

    class TestAdapter : PagerAdapter() {
        private val images = arrayOf(R.drawable.sanmartino, R.drawable.swissroad, R.drawable.card)
        override fun getCount(): Int {
            return images.size
        }

        override fun isViewFromObject(view: View, obj: Any): Boolean {
            return view == obj as View
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            return SubsamplingScaleImageView(container.context).apply {
                setImage(ImageSource.resource(images[position]))
                container.addView(this, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            }
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(`object` as View)
        }
    }
}