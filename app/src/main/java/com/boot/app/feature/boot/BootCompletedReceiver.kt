package com.boot.app.feature.boot

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.room.Room
import com.boot.app.domain.DataRepository
import com.boot.app.storage.AppDatabase
import com.boot.app.storage.DataRepositoryImpl
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class BootCompletedReceiver: BroadcastReceiver() {

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context, intent: Intent?) {
        // TODO ideally it will start a service and handle work inside
        // TODO use DI

        val dataBase = Room.databaseBuilder(context, AppDatabase::class.java, "boot-database").build()
        val dataRepository = DataRepositoryImpl(dataBase)
        dataRepository.createBootInfo(System.currentTimeMillis())
    }
}