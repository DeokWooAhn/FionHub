package com.example.fion.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class ManagerEntity(
    override val id: Long,
    val managerAccessId : String,
    val managerNickname : String,
    val managerLevel : Int
): Entity, Parcelable