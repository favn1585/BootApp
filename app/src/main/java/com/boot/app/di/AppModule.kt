package com.boot.app.di

import android.content.Context
import androidx.room.Room
import com.boot.app.domain.DataRepository
import com.boot.app.storage.AppDatabase
import com.boot.app.storage.DataRepositoryImpl

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
class AppModule {

    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "boot-database").build()
    }

    @Provides
    fun bindsDataRepository(
        dataBase: AppDatabase
    ): DataRepository = DataRepositoryImpl(dataBase)
}