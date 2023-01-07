package com.alpertign.borutoapp.data.repository

import androidx.paging.PagingData
import com.alpertign.borutoapp.domain.model.Hero
import com.alpertign.borutoapp.domain.repository.DataStoreOperations
import com.alpertign.borutoapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
class Repository @Inject constructor(
    private val remote: RemoteDataSource,
    private val dataStore: DataStoreOperations
) {

    fun getAllHeroes(): Flow<PagingData<Hero>>{
        return remote.getAllHeroes()
    }

    suspend fun saveOnBoardingState(completed: Boolean){
        dataStore.saveOnBoardingState(completed = completed)
    }

    fun readOnBoardingState(): Flow<Boolean>{
        return dataStore.readOnBoardingState()
    }

}