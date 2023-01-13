package com.alpertign.borutoapp.data.repository

import com.alpertign.borutoapp.data.local.BorutoDatabase
import com.alpertign.borutoapp.domain.model.Hero
import com.alpertign.borutoapp.domain.repository.LocalDataSource

/**
 * Created by Alperen Acikgoz on 13,January,2023
 */
class LocalDataSourceImpl(borutoDatabase: BorutoDatabase) : LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()
    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}