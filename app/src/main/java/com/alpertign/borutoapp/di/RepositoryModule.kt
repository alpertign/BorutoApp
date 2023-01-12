package com.alpertign.borutoapp.di

import android.content.Context
import com.alpertign.borutoapp.data.repository.DataStoreOperationsImpl
import com.alpertign.borutoapp.data.repository.Repository
import com.alpertign.borutoapp.domain.repository.DataStoreOperations
import com.alpertign.borutoapp.domain.use_cases.UseCases
import com.alpertign.borutoapp.domain.use_cases.get_all_heroes.GetAllHeroesUseCase
import com.alpertign.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.alpertign.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import com.alpertign.borutoapp.domain.use_cases.search_heroes.SearchHeroesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Alperen Acikgoz on 05,January,2023
 */
@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations{
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases{
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository),
            searchHeroesUseCase = SearchHeroesUseCase(repository)
        )
    }

}