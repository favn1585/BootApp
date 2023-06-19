package com.boot.app.storage

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Boot(
    @PrimaryKey(autoGenerate = true) val id: Long? = null,
    @ColumnInfo(name = "time") val timeInMilliseconds: Long,
)