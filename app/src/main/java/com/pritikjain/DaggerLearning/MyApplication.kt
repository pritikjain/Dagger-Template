package com.pritikjain.DaggerLearning

import android.app.Application
import com.pritikjain.DaggerLearning.data.local.DatabaseService
import com.pritikjain.DaggerLearning.data.remote.NetworkService
import com.pritikjain.DaggerLearning.di.component.ApplicationComponent
import com.pritikjain.DaggerLearning.di.component.DaggerApplicationComponent
import com.pritikjain.DaggerLearning.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var networkService: NetworkService

    @Inject
    lateinit var databaseService: DatabaseService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    private fun getDependencies()
    {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }
}