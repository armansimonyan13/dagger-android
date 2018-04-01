package com.example.armansimonyan.dagger2_14;

import com.example.armansimonyan.dagger2_14.dagger.FragmentScope;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragment;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragmentContract;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragmentPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MockMainFragmentModule {

	@FragmentScope
	@Binds
	abstract MainFragmentContract.View view(MainFragment mainFragment);

	@FragmentScope
	@Provides
	static MainFragmentContract.Listener listener(MainFragmentContract.View view, MainFragmentPresenter mainFragmentPresenter) {
		view.getType();
		return MockProvider.getMainFragmentContractListener();
	}
}
