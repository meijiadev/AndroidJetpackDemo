package com.ddr.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_timer.*

class TimerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
        initComponent()
    }


    private fun initComponent(){
       val timeViewModel:TimeViewModel =ViewModelProvider(this).get(TimeViewModel::class.java)
        timeViewModel.onTimeChangedListener=object: TimeViewModel.OnTimeChangeListener {
            override fun onTimeChanged(second: Int) {
                runOnUiThread {
                    tvTime.text=second.toString()
                }
            }
        }
        timeViewModel.startTiming()
    }

}