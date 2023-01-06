package com.alpertign.borutoapp.data.remote

import com.alpertign.borutoapp.domain.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Alperen Acikgoz on 06,January,2023
 */
interface BorutoApi {

    @GET("/boruto/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1
    ): ApiResponse

    @GET("/boruto/heroes/search")
    suspend fun searchHeroes(
        @Query("name") name: String
    ):ApiResponse
}