package com.example.armansimonyan.dagger2_14.dagger;

import com.example.armansimonyan.dagger2_14.secondary_activity.SecondaryActivity;
import com.example.armansimonyan.dagger2_14.secondary_activity.SecondaryActivityContract;
import com.example.armansimonyan.dagger2_14.secondary_activity.SecondaryActivityPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class SecondaryActivityModule {

	@ActivityScope
	@Provides
	static SecondaryActivityContract.Listener listener(
			SecondaryActivityContract.View view,
			SecondaryActivityPresenter secondaryActivityPresenter
	) {
		return secondaryActivityPresenter;
	}

	@ActivityScope
	@Binds
	abstract SecondaryActivityContract.View view(SecondaryActivity secondaryActivity);

}