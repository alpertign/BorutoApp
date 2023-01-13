package com.alpertign.borutoapp.domain.use_cases.get_selected_hero

import com.alpertign.borutoapp.data.repository.Repository
import com.alpertign.borutoapp.domain.model.Hero

/**
 * Created by Alperen Acikgoz on 13,January,2023
 */
class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero{
        return repository.getSelectedHero(heroId)
    }
}