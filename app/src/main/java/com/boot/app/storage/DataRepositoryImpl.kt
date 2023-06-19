package com.boot.app.storage

import com.boot.app.domain.BootInfo
import com.boot.app.domain.DataRepository
import javax.inject.Inject

class DataRepositoryImpl @Inject constructor(
    private val appDatabase: AppDatabase
) : DataRepository {
    override fun createBootInfo(timestamp: Long) {
        // TODO coroutines
        appDatabase.bootDao().insert(Boot(timeInMilliseconds = timestamp))
    }

    // TODO coroutines
    override fun getBootInfoList() = appDatabase.bootDao().getAll().map {
        BootInfo(
            index = it.id ?: 0L, timeInMilliseconds = it.timeInMilliseconds
        )
    }
}