package com.alpertign.borutoapp.domain.repository

import com.alpertign.borutoapp.domain.model.Hero

/**
 * Created by Alperen Acikgoz on 13,January,2023
 */
interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}