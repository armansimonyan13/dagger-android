package com.example.armansimonyan.dagger2_14.main_activity

import com.example.armansimonyan.dagger2_14.main_activity.MainActivityContract
import javax.inject.Inject

class MainActivityPresenter @Inject constructor() : MainActivityContract.Listener {

	override fun getText(): String {
		return "OK"
	}

}