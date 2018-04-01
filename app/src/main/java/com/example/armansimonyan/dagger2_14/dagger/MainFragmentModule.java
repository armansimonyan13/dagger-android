package com.example.armansimonyan.dagger2_14.dagger;

import com.example.armansimonyan.dagger2_14.dagger.FragmentScope;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragment;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragmentContract;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragmentPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class MainFragmentModule {

	@FragmentScope
	@Binds
	abstract MainFragmentContract.View view(MainFragment mainFragment);

	@FragmentScope
	@Provides
	static MainFragmentContract.Listener listener(MainFragmentContract.View view, MainFragmentPresenter mainFragmentPresenter) {
		view.getType();
		return mainFragmentPresenter;
	}

}