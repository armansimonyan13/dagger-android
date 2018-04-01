package com.example.armansimonyan.dagger2_14.dagger

import com.example.armansimonyan.dagger2_14.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
	fun inject(application: Application)
}