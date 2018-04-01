package com.example.armansimonyan.dagger2_14;

import com.example.armansimonyan.dagger2_14.dagger.ActivityScope;
import com.example.armansimonyan.dagger2_14.main_activity.MainActivity;
import com.example.armansimonyan.dagger2_14.main_activity.MainActivityContract;
import com.example.armansimonyan.dagger2_14.main_activity.MainActivityPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MockMainActivityModule {

	@ActivityScope
	@Provides
	static MainActivityContract.Listener listener(
			MainActivityContract.View view,
			MainActivityPresenter mainActivityPresenter
	) {
		view.getType();
		return MockProvider.getMainActivityContractListener();
	}

	@Binds
	@ActivityScope
	abstract MainActivityContract.View view(MainActivity mainActivity);

}
