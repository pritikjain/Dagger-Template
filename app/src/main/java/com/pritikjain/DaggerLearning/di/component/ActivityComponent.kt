package com.pritikjain.DaggerLearning.di.component

import com.pritikjain.DaggerLearning.di.ActivityScope
import com.pritikjain.DaggerLearning.di.module.ActivityModule
import com.pritikjain.DaggerLearning.ui.main.MainActivity
import dagger.Component


@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}