package com.pritikjain.DaggerLearning.di.component

import android.app.Application
import android.content.Context
import com.pritikjain.DaggerLearning.data.local.DatabaseService
import com.pritikjain.DaggerLearning.data.local.FileStorageService
import com.pritikjain.DaggerLearning.data.remote.NetworkService
import com.pritikjain.DaggerLearning.di.ApplicationContext
import com.pritikjain.DaggerLearning.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: Application)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService

    fun getDatabaseService(): DatabaseService

    fun provideFileStorageService(): FileStorageService
}