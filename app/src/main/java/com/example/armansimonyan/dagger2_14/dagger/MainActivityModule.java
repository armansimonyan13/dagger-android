package com.example.armansimonyan.dagger2_14.dagger;

import com.example.armansimonyan.dagger2_14.main_activity.MainActivity;
import com.example.armansimonyan.dagger2_14.main_activity.MainActivityContract;
import com.example.armansimonyan.dagger2_14.main_activity.MainActivityPresenter;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

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

	@FragmentScope
	@ContributesAndroidInjector(modules = MainFragmentModule.class)
	abstract MainFragment mainFragment();

}