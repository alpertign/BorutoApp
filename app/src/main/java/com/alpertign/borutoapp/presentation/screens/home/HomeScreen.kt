package com.alpertign.borutoapp.presentation.screens.home

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.alpertign.borutoapp.navigation.Screen
import com.alpertign.borutoapp.presentation.common.ListContent
import com.alpertign.borutoapp.ui.theme.statusBarColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */

@ExperimentalCoilApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val allHeroes = homeViewModel.getAllHeroes.collectAsLazyPagingItems()

    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(
        color = MaterialTheme.colors.statusBarColor
    )

    Scaffold(
        topBar = {
            HomeTopBar(onSearchClicked = {
                navController.navigate(Screen.Search.route)
            })
        },
        content = {
            ListContent(
                heroes = allHeroes,
                navController = navController
            )
        }
    )

}