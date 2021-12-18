package com.example.davaleba5.adaoter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleba5.fragments.Fragment1
import com.example.davaleba5.fragments.Fragment2
import com.example.davaleba5.fragments.Fragment3

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount()=3
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->Fragment1()
            1->Fragment2()
            2->Fragment3()
            else ->Fragment1()

        }
    }

}