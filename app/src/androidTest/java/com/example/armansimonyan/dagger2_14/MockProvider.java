package com.example.armansimonyan.dagger2_14;

import com.example.armansimonyan.dagger2_14.main_activity.MainActivityContract;

import org.mockito.Mockito;

public class MockProvider {

	private static MainActivityContract.Listener mainActivityContractListener;

	public static MainActivityContract.Listener getMainActivityContractListener() {
		if (mainActivityContractListener == null) {
			mainActivityContractListener = Mockito.mock(MainActivityContract.Listener.class);
		}
		return mainActivityContractListener;
	}

}
