package com.alpertign.borutoapp.data.paging_source

import androidx.paging.*
import androidx.test.core.app.ApplicationProvider
import com.alpertign.borutoapp.data.local.BorutoDatabase
import com.alpertign.borutoapp.data.remote.FakeBorutoApi2
import com.alpertign.borutoapp.domain.model.Hero
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.runBlocking

/**
 * Created by Alperen Acikgoz on 14,January,2023
 */
@ExperimentalPagingApi
@ExperimentalCoroutinesApi
class HeroRemoteMediatorTest {
    private lateinit var borutoApi: FakeBorutoApi2
    private lateinit var borutoDatabase: BorutoDatabase

    @Before
    fun setup() {
        borutoApi = FakeBorutoApi2()
        borutoDatabase = BorutoDatabase.create(
            context = ApplicationProvider.getApplicationContext(),
            useInMemory = true
        )
    }

    @After
    fun cleanup() {
        borutoDatabase.clearAllTables()
    }


    @Test
    fun refreshLoadReturnSuccessResultWhenMoreDataIsPresent() =
        runBlocking {
            val remoteMediator = HeroRemoteMediator(
                borutoApi = borutoApi,
                borutoDatabase = borutoDatabase
            )
            val pagingState = PagingState<Int, Hero>(
                pages = listOf(),
                anchorPosition = null,
                config = PagingConfig(pageSize = 3),
                leadingPlaceholderCount = 0
            )
            val result = remoteMediator.load(
                LoadType.REFRESH,
                pagingState
            )
            assertTrue(result is RemoteMediator.MediatorResult.Success)
            assertFalse((result as RemoteMediator.MediatorResult.Success).endOfPaginationReached)

        }

    @Test
    fun refreshLoadSuccessAndEndOfPaginationTrueWhenNoMoreData() =
        runBlocking {
            borutoApi.clearData()
            val remoteMediator = HeroRemoteMediator(
                borutoApi = borutoApi,
                borutoDatabase = borutoDatabase
            )
            val pagingState = PagingState<Int, Hero>(
                pages = listOf(),
                anchorPosition = null,
                config = PagingConfig(pageSize = 3),
                leadingPlaceholderCount = 0
            )
            val result = remoteMediator.load(
                LoadType.REFRESH,
                pagingState
            )
            assertTrue(result is RemoteMediator.MediatorResult.Success)
            assertTrue((result as RemoteMediator.MediatorResult.Success).endOfPaginationReached)

        }

    @Test
    fun refreshLoadReturnsErrorResultWhenErrorOccurs() =
        runBlocking {
            borutoApi.addException()
            val remoteMediator = HeroRemoteMediator(
                borutoApi = borutoApi,
                borutoDatabase = borutoDatabase
            )
            val pagingState = PagingState<Int, Hero>(
                pages = listOf(),
                anchorPosition = null,
                config = PagingConfig(pageSize = 3),
                leadingPlaceholderCount = 0
            )
            val result = remoteMediator.load(
                LoadType.REFRESH,
                pagingState
            )
            assertTrue(result is RemoteMediator.MediatorResult.Error)

        }
}