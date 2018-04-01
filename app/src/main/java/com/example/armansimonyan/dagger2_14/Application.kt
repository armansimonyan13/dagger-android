package com.example.armansimonyan.dagger2_14

import android.app.Activity
import android.app.Application
import com.example.armansimonyan.dagger2_14.dagger.ApplicationComponent
import com.example.armansimonyan.dagger2_14.dagger.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class Application : Application(), HasActivityInjector {

	lateinit var component: ApplicationComponent

	@Inject
	lateinit var activityInjector: DispatchingAndroidInjector<Activity>

	override fun onCreate() {
		super.onCreate()
		component = DaggerApplicationComponent.create()
		component.inject(this)
	}

	override fun activityInjector(): AndroidInjector<Activity> {
		return activityInjector
	}

}