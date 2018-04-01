package com.example.armansimonyan.dagger2_14

import com.example.armansimonyan.dagger2_14.dagger.ActivityScope
import com.example.armansimonyan.dagger2_14.main_activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MockApplicationModule {

	@ActivityScope
	@ContributesAndroidInjector(modules = [MockMainActivityModule::class])
	abstract fun mainActivity(): MainActivity

}