package com.pritikjain.DaggerLearning.data.remote

import android.content.Context
import com.pritikjain.DaggerLearning.di.ApplicationContext
import com.pritikjain.DaggerLearning.di.NetworkApiKey
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkService @Inject constructor(
    private val httpClient: HttpClient,
    @ApplicationContext private val context: Context,
    @NetworkApiKey private val apiKey: String
) {

    fun getDummyData(): String {
        return "NETWORK_DUMMY_DATA"
    }
}