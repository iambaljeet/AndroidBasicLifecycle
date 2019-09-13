package com.app.baljeet.androidbasiclifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.baljeet.androidbasiclifecycle.utility.LoggingUtility

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity2)
        LoggingUtility.logInfoEvent(this::class.java, "onCreate")
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

    companion object {
        fun launchActivity(context: Context) {
            val intent = Intent(context, Main2Activity::class.java)
            context.startActivity(intent)
        }
    }
}
