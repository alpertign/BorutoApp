package com.alpertign.borutoapp.domain.repository

import androidx.paging.PagingData
import com.alpertign.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

/**
 * Created by Alperen Acikgoz on 08,January,2023
 */
interface RemoteDataSource {
    fun getAllHeroes() : Flow<PagingData<Hero>>
    fun searchHeroes(query:String): Flow<PagingData<Hero>>
}