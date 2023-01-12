package com.alpertign.borutoapp.domain.use_cases

import com.alpertign.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.alpertign.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.alpertign.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import com.alpertign.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase,
    val searchHeroesUseCase: SearchHeroesUseCase
)
