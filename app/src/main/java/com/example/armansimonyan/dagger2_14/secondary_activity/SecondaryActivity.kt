package com.example.armansimonyan.dagger2_14.secondary_activity

import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

class SecondaryActivity : AppCompatActivity(), SecondaryActivityContract.View {

	@Inject
	lateinit var presenter: SecondaryActivityContract.Listener
}