package com.boot.app.domain

interface DataRepository {
    fun createBootInfo(timestamp: Long)
    fun getBootInfoList(): List<BootInfo>
}