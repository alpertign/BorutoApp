package com.alpertign.borutoapp.domain.use_cases

import com.alpertign.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.alpertign.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.alpertign.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
    val getAllHeroesUseCase: GetAllHeroesUseCase
)
