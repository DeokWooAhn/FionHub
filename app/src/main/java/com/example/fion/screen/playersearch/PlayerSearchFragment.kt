package com.example.fion.screen.playersearch

import com.example.fion.databinding.FragmentPlayerSearchBinding
import com.example.fion.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class PlayerSearchFragment: BaseFragment<PlayerSearchViewModel, FragmentPlayerSearchBinding>() {

    override val viewModel by viewModel<PlayerSearchViewModel>()

    override fun getViewBinding(): FragmentPlayerSearchBinding = FragmentPlayerSearchBinding.inflate(layoutInflater)

    override fun initViews() {
        super.initViews()
    }

    override fun observeData() {

    }

    companion object {

        fun newInstance() = PlayerSearchFragment()

        const val TAG = "PlayerSearchFragment"
    }
}