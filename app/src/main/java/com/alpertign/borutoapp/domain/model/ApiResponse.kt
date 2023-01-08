package com.alpertign.borutoapp.domain.model

import kotlinx.serialization.Serializable

/**
 * Created by Alperen Acikgoz on 06,January,2023
 */
@Serializable
data class ApiResponse (
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList(),
    val lastUpdated: Long? = null
        )