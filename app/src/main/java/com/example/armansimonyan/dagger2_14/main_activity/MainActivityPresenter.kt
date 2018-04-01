package com.example.armansimonyan.dagger2_14.main_activity

import javax.inject.Inject

class MainActivityPresenter @Inject constructor() : MainActivityContract.Listener {

	override fun getText(): String {
		return "OK"
	}

}