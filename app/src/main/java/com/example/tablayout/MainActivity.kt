package com.example.tablayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayout.adapter.ViewPagerAdapter
import com.example.tablayout.ui.theme.TabLayoutTheme
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    
    val tabsArray = arrayOf("Books", "Games", "Movies")
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tablayout = findViewById<TabLayout>(R.id.tablayout)
        
        
        val my_adapter = ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )
        viewPager.adapter = my_adapter
        
        
        // Connecting the viewpager with tab layout
        TabLayoutMediator(tablayout, viewPager) {
                tab, position -> tab.text = tabsArray[position]
        }.attach()
        
        
        
        
    }
}