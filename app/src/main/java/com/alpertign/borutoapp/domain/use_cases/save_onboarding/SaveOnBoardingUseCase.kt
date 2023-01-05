package com.alpertign.borutoapp.domain.use_cases.save_onboarding

import com.alpertign.borutoapp.data.repository.Repository

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean){
        repository.saveOnBoardingState(completed)
    }
}