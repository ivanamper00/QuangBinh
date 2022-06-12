package com.wayneall.dongthap.android.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val fragments: List<Fragment>
) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        return fragments[position].apply {
            this as NavigationButtonListener
            this.lifecycle.addObserver(object : DefaultLifecycleObserver {
                override fun onResume(owner: LifecycleOwner) {
                    when (position) {
                        fragments.lastIndex -> {
                            showBack(true)
                            showNext(false)
                        }
                        0 -> {
                            showBack(false)
                            showNext(true)
                        }
                        else -> {
                            showBack(true)
                            showNext(true)
                        }
                    }
                }
            })
        }
    }

    override fun getItemCount(): Int {
        return fragments.size
    }
}