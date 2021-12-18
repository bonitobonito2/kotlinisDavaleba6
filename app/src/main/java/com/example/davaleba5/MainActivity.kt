package com.example.davaleba5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.davaleba5.adaoter.ViewPagerFragmentAdapter

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var toppager:TabLayout
    lateinit var viewPager:ViewPager2
    lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toppager=findViewById(R.id.tapbar)
        viewPager=findViewById(R.id.fragments)

        viewPagerFragmentAdapter= ViewPagerFragmentAdapter(this)

        viewPager.adapter=viewPagerFragmentAdapter


        TabLayoutMediator(toppager,viewPager){tab,position->
            tab.text="tab"+(position+1)

        }.attach()


    }
}