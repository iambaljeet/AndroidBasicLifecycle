package com.app.baljeet.androidbasiclifecycle

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.app.baljeet.androidbasiclifecycle.ui.main.FirstFragment
import com.app.baljeet.androidbasiclifecycle.ui.main.SecondFragment
import com.app.baljeet.androidbasiclifecycle.utility.LoggingUtility
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        launchFirstFragment()

        buttonReplaceFragment.setOnClickListener(this)
        buttonSwitchActivity.setOnClickListener(this)

        LoggingUtility.logInfoEvent(this::class.java, "onCreate")
    }

    private fun launchFirstFragment() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment.newInstance(), FirstFragment::class.java.simpleName)
                .commitNow()
    }

    private fun launchSecondFragment() {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment.newInstance(), SecondFragment::class.java.simpleName)
                .commitNow()

    }

    override fun onStart() {
        super.onStart()
        LoggingUtility.logInfoEvent(this::class.java, "onStart")
    }

    override fun onResume() {
        super.onResume()
        LoggingUtility.logInfoEvent(this::class.java, "onResume")
    }

    override fun onPause() {
        super.onPause()
        LoggingUtility.logInfoEvent(this::class.java, "onPause")
    }

    override fun onStop() {
        super.onStop()
        LoggingUtility.logInfoEvent(this::class.java, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LoggingUtility.logInfoEvent(this::class.java, "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        LoggingUtility.logInfoEvent(this::class.java, "onRestart")
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.buttonReplaceFragment -> {
                if (supportFragmentManager.findFragmentByTag(FirstFragment::class.java.simpleName) is FirstFragment) {
                    launchSecondFragment()
                } else {
                    launchFirstFragment()
                }
            }
            R.id.buttonSwitchActivity -> {
                Main2Activity.launchActivity(this)
            }
        }
    }
}
