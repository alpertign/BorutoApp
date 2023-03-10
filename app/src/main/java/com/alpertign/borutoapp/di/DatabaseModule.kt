package com.alpertign.borutoapp.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.alpertign.borutoapp.data.local.BorutoDatabase
import com.alpertign.borutoapp.data.repository.LocalDataSourceImpl
import com.alpertign.borutoapp.domain.repository.LocalDataSource
import com.alpertign.borutoapp.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Alperen Acikgoz on 04,January,2023
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): BorutoDatabase {
        return Room.databaseBuilder(
            context,
            BorutoDatabase::class.java,
            BORUTO_DATABASE
        ).build()
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(
        dataBase : BorutoDatabase
    ): LocalDataSource{
        return LocalDataSourceImpl(
            borutoDatabase = dataBase
        )
    }

}