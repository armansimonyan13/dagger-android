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

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

	@Rule
	public ActivityTestRule<MainActivity> activityTestRule =
			new ActivityTestRule<MainActivity>(MainActivity.class, false, false);

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void useAppContext() {
//		Application application = (Application) activityTestRule.getActivity().getApplication();
		Application application = (Application) InstrumentationRegistry.getTargetContext().getApplicationContext();

		DaggerMockApplicationComponent.create().inject(application);

		activityTestRule.launchActivity(null);


//		AndroidInjection.

		Mockito.verify(MockProvider.getMainActivityContractListener()).getText();
		Mockito.verify(MockProvider.getMainFragmentContractListener()).getText();

		// Context of the app under test.
//		val appContext = InstrumentationRegistry.getTargetContext()
//		assertEquals("com.example.armansimonyan.dagger2_14", appContext.packageName)
	}
}
