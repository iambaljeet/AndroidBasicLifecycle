package com.app.baljeet.androidbasiclifecycle.utility

import android.util.Log

object LoggingUtility {
    fun <T>logErrorEvent(className: Class<T>, event: String?) {
        Log.e(className.simpleName, "Lifecycle: $event")
    }

    fun <T>logDebugEvent(className: Class<T>, event: String?) {
        Log.d(className.simpleName, "Lifecycle: $event")
    }

    fun <T>logInfoEvent(className: Class<T>, event: String?) {
        Log.i(className.simpleName, "Lifecycle: $event")
    }

    fun <T>logVerboseEvent(className: Class<T>, event: String?) {
        Log.v(className.simpleName, "Lifecycle: $event")
    }
}