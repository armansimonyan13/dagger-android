package com.example.armansimonyan.dagger2_14.main_fragment

interface MainFragmentContract {

	interface View {
		fun getType(): Int
	}

	interface Listener {
		fun getText(): String
	}
}