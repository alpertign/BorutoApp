package com.alpertign.borutoapp.data.repository

import com.alpertign.borutoapp.domain.repository.DataStoreOperations
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
class Repository @Inject constructor(
    private val dataStore: DataStoreOperations
) {
    suspend fun saveOnBoardingState(completed: Boolean){
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean>{
        return dataStore.readOnBoardingState()
    }

}