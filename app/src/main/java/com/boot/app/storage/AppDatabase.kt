package com.boot.app.storage

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Boot::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bootDao(): BootDao
}