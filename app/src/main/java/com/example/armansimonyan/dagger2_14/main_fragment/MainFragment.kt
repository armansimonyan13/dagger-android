package com.example.armansimonyan.dagger2_14.main_fragment

import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.armansimonyan.dagger2_14.R
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment : Fragment(), MainFragmentContract.View {

	@Inject
	lateinit var presenter: MainFragmentContract.Listener

	@Suppress("OverridingDeprecatedMember")
	override fun onAttach(activity: Activity?) {
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
			AndroidSupportInjection.inject(this)
		}
		super.onAttach(activity)
	}

	override fun onAttach(context: Context?) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			AndroidSupportInjection.inject(this)
		}
		super.onAttach(context)
	}

	override fun getType(): Int {
		return 1
	}

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
		return inflater.inflate(R.layout.fragment_main, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		view.findViewById<TextView>(R.id.text).text = presenter.getText()
	}
}