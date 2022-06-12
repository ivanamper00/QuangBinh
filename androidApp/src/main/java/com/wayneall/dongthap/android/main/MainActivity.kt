package com.wayneall.dongthap.android.main

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.wayneall.dongthap.android.common.binding.viewBinding
import com.wayneall.dongthap.android.data.Data
import com.wayneall.dongthap.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),DetailsFragment.Listener {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    private val fragments: MutableList<Fragment> = mutableListOf()

    private lateinit var viewPagerAdapter : ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Data.contents.forEach {
            fragments.add(DetailsFragment(it, this))
        }
        viewPagerAdapter = ViewPagerAdapter(this,fragments)

        with(binding){
            viewPager.adapter = viewPagerAdapter
        }
    }

    companion object{
        fun getStartIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

    override fun onNext() {
        binding.viewPager.setCurrentItem(binding.viewPager.currentItem + 1, true)
    }

    override fun onBack() {
        binding.viewPager.setCurrentItem(binding.viewPager.currentItem - 1, true)
    }

    override fun onBackPressed() {
        if(binding.viewPager.currentItem > 0) onBack()
        else AlertDialog.Builder(this)
            .setTitle("Exit Application?")
            .setMessage("Do you want to exit?")
            .setPositiveButton("Ok"){ _,_ -> super.onBackPressed() }
            .setNegativeButton("Cancel"){ d, _ -> d.dismiss()}
            .show()
    }
}
