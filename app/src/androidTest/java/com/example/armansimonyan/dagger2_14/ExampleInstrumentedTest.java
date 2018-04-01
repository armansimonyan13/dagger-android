package com.example.armansimonyan.dagger2_14;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.armansimonyan.dagger2_14.main_activity.MainActivity;

import org.junit.After;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.Before;
import org.junit.Rule;
import org.mockito.Mockito;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

	@Rule
	public ActivityTestRule<MainActivity> activityTestRule =
			new ActivityTestRule<>(MainActivity.class, false, false);

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void useAppContext() {
		Application application = (Application) InstrumentationRegistry.getTargetContext().getApplicationContext();

		DaggerMockApplicationComponent.create().inject(application);

		activityTestRule.launchActivity(null);
		Mockito.verify(MockProvider.getMainActivityContractListener()).getText();
	}

}
