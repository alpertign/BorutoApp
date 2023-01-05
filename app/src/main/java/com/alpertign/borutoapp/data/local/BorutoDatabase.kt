package com.alpertign.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.alpertign.borutoapp.data.local.dao.HeroDao
import com.alpertign.borutoapp.data.local.dao.HeroRemoteKeyDao
import com.alpertign.borutoapp.domain.model.Hero
import com.alpertign.borutoapp.domain.model.HeroRemoteKey

/**
 * Created by Alperen Acikgoz on 04,January,2023
 */
@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase(){
    abstract fun heroDao() : HeroDao
    abstract fun heroRemoteKeyDao() : HeroRemoteKeyDao
}