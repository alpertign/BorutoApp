package com.alpertign.borutoapp.domain.repository

import kotlinx.coroutines.flow.Flow


/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
interface DataStoreOperations {
    suspend fun saveOnBoardingState(completed: Boolean)
    fun readOnBoardingState(): Flow<Boolean>
}