package com.pritikjain.DaggerLearning.di.module

import android.app.Application
import android.content.Context
import com.pritikjain.DaggerLearning.MyApplication
import com.pritikjain.DaggerLearning.data.local.FileStorageService
import com.pritikjain.DaggerLearning.data.remote.HttpClient
import com.pritikjain.DaggerLearning.di.ApplicationContext
import com.pritikjain.DaggerLearning.di.DatabaseName
import com.pritikjain.DaggerLearning.di.DatabaseVersion
import com.pritikjain.DaggerLearning.di.NetworkApiKey
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }

    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

    @Provides
    @DatabaseName
    fun provideDatabaseName(): String = "dummy_db"

    @Provides
    @DatabaseVersion
    fun provideDatabaseVersion(): Int = 1

    @Provides
    @NetworkApiKey
    fun provideApiKey(): String = "SOME_API_KEY"

    @Singleton
    @Provides
    fun provideFileStorageService(): FileStorageService {
        return FileStorageService()
    }

}