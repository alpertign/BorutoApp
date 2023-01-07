package com.alpertign.borutoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.alpertign.borutoapp.data.repository.Repository
import com.alpertign.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

/**
 * Created by Alperen Acikgoz on 08,January,2023
 */
class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>>{
        return repository.getAllHeroes()
    }
}