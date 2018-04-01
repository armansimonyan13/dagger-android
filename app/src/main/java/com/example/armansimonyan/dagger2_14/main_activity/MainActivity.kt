package com.example.armansimonyan.dagger2_14.main_activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.armansimonyan.dagger2_14.R
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {

	@Inject
	lateinit var presenter: MainActivityContract.Listener

	override fun onCreate(savedInstanceState: Bundle?) {
		AndroidInjection.inject(this)
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		findViewById<TextView>(R.id.text).text = presenter.getText()
	}

	override fun getType(): Int {
		return 0
	}

}
