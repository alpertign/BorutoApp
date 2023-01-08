package com.alpertign.borutoapp.presentation.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.alpertign.borutoapp.presentation.components.RatingWidget
import com.alpertign.borutoapp.ui.theme.LARGE_PADDING

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */

@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
    ) {
    val allHeroes = homeViewModel.getAllHeroes.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {})
        }
    ) {
        RatingWidget(modifier = Modifier.padding(all = LARGE_PADDING), rating = 4.1)

    }

}