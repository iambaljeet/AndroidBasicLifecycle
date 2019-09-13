package com.app.baljeet.androidbasiclifecycle.ui.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.baljeet.androidbasiclifecycle.R
import com.app.baljeet.androidbasiclifecycle.utility.LoggingUtility

class SecondFragment : Fragment() {

    companion object {
        fun newInstance() = SecondFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        LoggingUtility.logInfoEvent(this::class.java, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LoggingUtility.logInfoEvent(this::class.java, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        LoggingUtility.logInfoEvent(this::class.java, "onCreateView")
        return inflater.inflate(R.layout.second_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        LoggingUtility.logInfoEvent(this::class.java, "onActivityCreated")
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

    override fun onDestroyView() {
        super.onDestroyView()
        LoggingUtility.logInfoEvent(this::class.java, "onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        LoggingUtility.logInfoEvent(this::class.java, "onDetach")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LoggingUtility.logInfoEvent(this::class.java, "onViewCreated")
    }
}
