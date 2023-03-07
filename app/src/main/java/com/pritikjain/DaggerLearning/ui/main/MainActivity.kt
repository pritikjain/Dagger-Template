package com.pritikjain.DaggerLearning.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pritikjain.DaggerLearning.MyApplication
import com.pritikjain.DaggerLearning.R
import com.pritikjain.DaggerLearning.di.component.DaggerActivityComponent
import com.pritikjain.DaggerLearning.di.module.ActivityModule
import com.pritikjain.DaggerLearning.ui.home.HomeFragment
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies();
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,viewModel.getSomeData(),Toast.LENGTH_LONG).show()

        addHomeFragment()
    }

    private fun addHomeFragment()
    {
        if(supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment,HomeFragment.newInstance(),HomeFragment.TAG)
                .commit()
        }
    }



    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}