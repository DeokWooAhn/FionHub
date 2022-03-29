package com.example.fion.data.repository

import com.example.fion.data.entity.ManagerEntity
import com.example.fion.screen.managerinfo.detail.ManagerDetailCategory
import com.example.fion.util.provider.ResourceProvider
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class DefatulManagerInfoRepository(
    private val resourcesProvider: ResourceProvider,
    private val ioDispatcher: CoroutineDispatcher
): ManagerInfoRepository {

    override suspend fun getManager(
        managerDetailCategory: ManagerDetailCategory
    ): List<ManagerEntity> = withContext(ioDispatcher) {
        listOf(

        )
    }
}