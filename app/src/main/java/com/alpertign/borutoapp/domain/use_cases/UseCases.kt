package com.alpertign.borutoapp.domain.use_cases

import com.alpertign.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.alpertign.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase
)
