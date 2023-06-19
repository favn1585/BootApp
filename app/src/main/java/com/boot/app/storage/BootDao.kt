package com.boot.app.storage

import androidx.room.*

@Dao
interface BootDao {
    @Query("SELECT * FROM boot")
    fun getAll(): List<Boot>

    @Insert
    fun insert(users: Boot)
}