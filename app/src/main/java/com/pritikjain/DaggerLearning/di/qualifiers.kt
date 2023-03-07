package com.pritikjain.DaggerLearning.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ApplicationContext

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class ActivityContext

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DatabaseName

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class DatabaseVersion

@Qualifier
@Retention(AnnotationRetention.SOURCE)
annotation class NetworkApiKey


