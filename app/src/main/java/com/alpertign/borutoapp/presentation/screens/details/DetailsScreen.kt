package com.alpertign.borutoapp.presentation.screens.details

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi

/**
 * Created by Alperen Acikgoz on 13,January,2023
 */

@ExperimentalCoilApi
@ExperimentalMaterialApi
@Composable
fun DetailsScreen(
    navController: NavHostController,
    detailsViewModel: DetailsViewModel= hiltViewModel()
    ){

    val selectedHero by detailsViewModel.selectedHero.collectAsState()

    DetailsContent(navController = navController, selectedHero = selectedHero)
}