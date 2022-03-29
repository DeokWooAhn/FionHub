package com.example.fion.data.repository

import com.example.fion.data.entity.ManagerEntity
import com.example.fion.screen.managerinfo.detail.ManagerDetailCategory

interface ManagerInfoRepository {

    suspend fun getManager(
        managerDetailCategory: ManagerDetailCategory
    ): List<ManagerEntity>
}