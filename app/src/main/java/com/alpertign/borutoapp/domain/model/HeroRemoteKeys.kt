package com.alpertign.borutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.alpertign.borutoapp.util.Constants.HERO_REMOTE_KEYS_DATABASE_TABLE

/**
 * Created by Alperen Acikgoz on 04,January,2023
 */
@Entity(tableName = HERO_REMOTE_KEYS_DATABASE_TABLE)
data class HeroRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)