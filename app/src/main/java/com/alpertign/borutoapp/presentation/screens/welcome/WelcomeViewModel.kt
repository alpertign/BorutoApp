package com.alpertign.borutoapp.presentation.screens.welcome

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alpertign.borutoapp.domain.use_cases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val useCases: UseCases
) :ViewModel(){

    fun saveOnBoardingState(completed: Boolean){
        viewModelScope.launch (Dispatchers.IO){
            useCases.saveOnBoardingUseCase(completed = completed)
        }
    }

}