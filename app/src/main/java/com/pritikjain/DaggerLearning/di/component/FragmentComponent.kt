package com.pritikjain.DaggerLearning.di.component

import com.pritikjain.DaggerLearning.di.FragmentScope
import com.pritikjain.DaggerLearning.di.module.FragmentModule
import com.pritikjain.DaggerLearning.ui.home.HomeFragment
import dagger.Component


@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(fragment: HomeFragment)
}