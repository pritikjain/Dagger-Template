package com.pritikjain.DaggerLearning.ui.main

import com.pritikjain.DaggerLearning.data.local.DatabaseService
import com.pritikjain.DaggerLearning.data.remote.NetworkService
import com.pritikjain.DaggerLearning.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    fun getSomeData(): String {
        return "dsHashCode: " + databaseService.hashCode() + "\n" + "nsHashCode: "+ networkService.hashCode()
    }

}