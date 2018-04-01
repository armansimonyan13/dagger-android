package com.example.armansimonyan.dagger2_14.dagger;

import com.example.armansimonyan.dagger2_14.main_activity.MainActivity;
import com.example.armansimonyan.dagger2_14.main_activity.MainActivityContract;
import com.example.armansimonyan.dagger2_14.main_activity.MainActivityPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class MainActivityModule {

	@ActivityScope
	@Provides
	static MainActivityContract.Listener listener(
			MainActivityContract.View view,
			MainActivityPresenter mainActivityPresenter
	) {
		view.getType();
		return mainActivityPresenter;
	}

	@ActivityScope
	@Binds
	abstract MainActivityContract.View view(MainActivity mainActivity);

}