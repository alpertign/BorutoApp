package com.alpertign.borutoapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.alpertign.borutoapp.data.local.dao.HeroDao
import com.alpertign.borutoapp.data.local.dao.HeroRemoteKeysDao
import com.alpertign.borutoapp.domain.model.Hero
import com.alpertign.borutoapp.domain.model.HeroRemoteKeys

/**
 * Created by Alperen Acikgoz on 04,January,2023
 */
@Database(
    entities = [Hero::class, HeroRemoteKeys::class],
    version = 1
)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    companion object {
        //Bu companion object testing için yazıldı.
        fun create(context: Context, useInMemory: Boolean): BorutoDatabase {
            val databaseBuilder = if (useInMemory) {
                Room.inMemoryDatabaseBuilder(
                    context,
                    BorutoDatabase::class.java
                )
            } else {
                Room.databaseBuilder(
                    context,
                    BorutoDatabase::class.java,
                    "test_database.db"
                )
            }
            return databaseBuilder
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao
}