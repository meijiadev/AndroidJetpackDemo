package com.ddr.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ddr.jetpackdemo.TimeViewModel.OnTimeChangeListener

/**
 * 用于Java转kotlin
 */
class test {
    private fun s(activity: AppCompatActivity) {
        val timeViewModel = ViewModelProvider(activity).get(
            TimeViewModel::class.java
        )
        timeViewModel.onTimeChangedListener = object : OnTimeChangeListener {
            override fun onTimeChanged(second: Int) {
                activity.runOnUiThread { }
            }
        }
    }

    var a = 0

}