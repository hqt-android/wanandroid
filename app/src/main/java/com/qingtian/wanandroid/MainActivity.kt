package com.qingtian.wanandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.qingtian.common_base.component.BaseActivity
import com.qingtian.wanandroid.home.ui.HomeFragment
import com.qingtian.wanandroid.knoledge.ui.KnowledgeFragment

/**
 * 底部导航栏+fragment +
 */
class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager2 = findViewById<ViewPager2>(R.id.main_view_pager)
        val navView = findViewById<BottomNavigationView>(R.id.nav_view)

        val fragmentList = listOf<Fragment>(HomeFragment(),KnowledgeFragment())

//        viewPager2.adapter = FragmentPagerAdapter(supportFragmentManager)
    }
}