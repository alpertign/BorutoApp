package com.alpertign.borutoapp.domain.use_cases.search_heroes

import androidx.paging.PagingData
import com.alpertign.borutoapp.data.repository.Repository
import com.alpertign.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

/**
 * Created by Alperen Acikgoz on 12,January,2023
 */
class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query:String) : Flow<PagingData<Hero>>{
        return repository.searchHeroes(query)
    }
}