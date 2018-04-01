package com.example.armansimonyan.dagger2_14.dagger

import com.example.armansimonyan.dagger2_14.main_activity.MainActivity
import com.example.armansimonyan.dagger2_14.secondary_activity.SecondaryActivity
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector

@Module(includes = [AndroidInjectionModule::class])
abstract class ApplicationModule {

	@ActivityScope
	@ContributesAndroidInjector(modules = [MainActivityModule::class])
	abstract fun mainActivity(): MainActivity

	@ActivityScope
	@ContributesAndroidInjector(modules = [SecondaryActivityModule::class])
	abstract fun secondaryActivity(): SecondaryActivity

}