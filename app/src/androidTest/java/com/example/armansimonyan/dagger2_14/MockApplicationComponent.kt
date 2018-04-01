package com.example.armansimonyan.dagger2_14

import com.example.armansimonyan.dagger2_14.dagger.ApplicationComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockApplicationModule::class])
interface MockApplicationComponent : ApplicationComponent
