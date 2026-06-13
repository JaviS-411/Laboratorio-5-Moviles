package com.example.labo04

import android.app.Application
import androidx.room.Room
import com.example.labo04.Model.AppDatabase

class TaskApp : Application() {
    companion object {
        lateinit var database: AppDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "tasks_db"
        )
        .fallbackToDestructiveMigration()
        .build()
    }
}