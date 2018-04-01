package com.example.armansimonyan.dagger2_14;

import com.example.armansimonyan.dagger2_14.main_activity.MainActivityContract;
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragmentContract;

import org.mockito.Mockito;

public class MockProvider {

	private static MainActivityContract.Listener mainActivityContractListener;

	public static MainActivityContract.Listener getMainActivityContractListener() {
		if (mainActivityContractListener == null) {
			mainActivityContractListener = Mockito.mock(MainActivityContract.Listener.class);
		}
		return mainActivityContractListener;
	}

	private static MainFragmentContract.Listener mainFragmentContractListener;

	public static MainFragmentContract.Listener getMainFragmentContractListener() {
		if (mainFragmentContractListener == null) {
			mainFragmentContractListener = Mockito.mock(MainFragmentContract.Listener.class);
		}
		return mainFragmentContractListener;
	}
}
