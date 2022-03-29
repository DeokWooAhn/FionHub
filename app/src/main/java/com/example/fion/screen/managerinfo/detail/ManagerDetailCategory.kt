package com.example.fion.screen.managerinfo.detail

import androidx.annotation.StringRes
import com.example.fion.R

enum class ManagerDetailCategory(
    @StringRes val categoryNameId: Int
) {
    Match(R.string.match), Trade(R.string.trade)
}