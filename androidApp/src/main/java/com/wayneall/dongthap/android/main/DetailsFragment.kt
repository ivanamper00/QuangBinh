package com.wayneall.dongthap.android.main

import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.wayneall.dongthap.android.R
import com.wayneall.dongthap.android.common.base.BaseFragment
import com.wayneall.dongthap.android.common.binding.viewBinding
import com.wayneall.dongthap.android.common.extensions.isVisible
import com.wayneall.dongthap.android.data.ContentModel
import com.wayneall.dongthap.android.databinding.FragmentDashboardBinding


class DetailsFragment(
    private val content: ContentModel,
    private val listener: Listener
) : BaseFragment(R.layout.fragment_dashboard), NavigationButtonListener {

    private val binding by viewBinding(FragmentDashboardBinding::bind)

    override fun setupViews() {
        with(binding){
            val tint = ContextCompat.getColorStateList(requireContext(), content.color)
            textViewTitle.text = content.title
            textViewDescription.text = content.description
            headerImage.setImageResource(content.imageResource)
            mainBackground.backgroundTintList = tint
            btnBack.backgroundTintList = tint
            btnNext.backgroundTintList = tint

            btnBack.setOnClickListener {
                listener.onBack()
            }
            btnNext.setOnClickListener {
                listener.onNext()
            }
        }
    }

    override fun viewModelObservers() {
    }

    override fun showBack(isShow: Boolean) {
        if(isAdded) binding.btnBack.isVisible(isShow)
    }

    override fun showNext(isShow: Boolean) {
        if(isAdded) binding.btnNext.isVisible(isShow)
    }

    interface Listener{
        fun onNext()
        fun onBack()
    }
}