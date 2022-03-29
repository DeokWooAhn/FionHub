package com.example.fion.screen.managerinfo.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fion.databinding.ActivityManagerDetailBinding
import com.example.fion.screen.base.BaseActivity

class ManagerDetailActivity : BaseActivity<ManagerDetailViewModel, ActivityManagerDetailBinding>() {

    override val viewModel: ManagerDetailViewModel
        get() = TODO("Not yet implemented")

    override fun getViewBinding(): ActivityManagerDetailBinding =
        ActivityManagerDetailBinding.inflate(layoutInflater)

    override fun observeData() {
        TODO("Not yet implemented")
    }
}