package com.example.fion.screen.managerinfo

import com.example.fion.databinding.FragmentManagerInfoBinding
import com.example.fion.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class ManagerInfoFragment: BaseFragment<ManagerInfoViewModel, FragmentManagerInfoBinding>() {

    override val viewModel by viewModel<ManagerInfoViewModel>()

    override fun getViewBinding(): FragmentManagerInfoBinding = FragmentManagerInfoBinding.inflate(layoutInflater)

    override fun observeData() {

    }

    companion object {

        fun newInstance() = ManagerInfoFragment()

        const val TAG = "UserInfoFragment"
    }
}