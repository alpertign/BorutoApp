package com.alpertign.borutoapp.presentation.screens.home

import androidx.lifecycle.ViewModel
import com.alpertign.borutoapp.domain.use_cases.UseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Alperen Acikgoz on 08,January,2023
 */
@HiltViewModel
class HomeViewModel @Inject constructor(
    useCases: UseCases
): ViewModel() {
    val getAllHeroes = useCases.getAllHeroesUseCase()

}