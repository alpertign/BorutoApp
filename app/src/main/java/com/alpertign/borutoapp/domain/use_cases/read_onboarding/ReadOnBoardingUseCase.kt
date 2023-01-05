package com.alpertign.borutoapp.domain.use_cases.read_onboarding

import com.alpertign.borutoapp.data.repository.Repository
import kotlinx.coroutines.flow.Flow

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
class ReadOnBoardingUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<Boolean>{
        return repository.readOnBoardingState()
    }
}