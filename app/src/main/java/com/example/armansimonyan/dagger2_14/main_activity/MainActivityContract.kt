package com.example.armansimonyan.dagger2_14.main_activity

interface MainActivityContract {

	interface View {
		fun getType(): Int
	}

	interface Listener {
		fun getText(): String
	}
}