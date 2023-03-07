package com.pritikjain.DaggerLearning.data.local

import android.content.Context
import com.pritikjain.DaggerLearning.di.ApplicationContext
import com.pritikjain.DaggerLearning.di.DatabaseName
import com.pritikjain.DaggerLearning.di.DatabaseVersion
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatabaseService @Inject constructor(
    @ApplicationContext private val context: Context,
    @DatabaseName private val databaseName: String,
    @DatabaseVersion private val version: Int
    ){

    fun getDummyData(): String {
        return "DATABASE_DUMMY_DATA"
    }
}