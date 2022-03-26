package com.example.fion.screen.userinfo

import com.example.fion.databinding.FragmentUserInfoBinding
import com.example.fion.screen.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class UserInfoFragment: BaseFragment<UserInfoViewModel, FragmentUserInfoBinding>() {

    override val viewModel by viewModel<UserInfoViewModel>()

    override fun getViewBinding(): FragmentUserInfoBinding = FragmentUserInfoBinding.inflate(layoutInflater)

    override fun observeData() {

    }
}