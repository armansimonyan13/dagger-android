package com.example.armansimonyan.dagger2_14.main_fragment

import com.example.armansimonyan.dagger2_14.main_fragment.MainFragmentContract
import javax.inject.Inject

class MainFragmentPresenter @Inject constructor() : MainFragmentContract.Listener {

	override fun getText(): String {
		return "ok 2"
	}

}