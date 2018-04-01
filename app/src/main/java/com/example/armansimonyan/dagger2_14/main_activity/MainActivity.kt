package com.example.armansimonyan.dagger2_14.main_activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.TextView
import com.example.armansimonyan.dagger2_14.main_fragment.MainFragment
import com.example.armansimonyan.dagger2_14.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View, HasSupportFragmentInjector {

	@Inject
	lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

	@Inject
	lateinit var presenter: MainActivityContract.Listener

	override fun onCreate(savedInstanceState: Bundle?) {
		AndroidInjection.inject(this)
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		findViewById<TextView>(R.id.text).text = presenter.getText()

		supportFragmentManager.beginTransaction()
				.add(R.id.container, MainFragment())
				.commit()
	}

	override fun getType(): Int {
		return 0
	}

	override fun supportFragmentInjector(): AndroidInjector<android.support.v4.app.Fragment> {
		return fragmentInjector
	}

}
