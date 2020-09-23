package com.ddr.jetpackdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.concurrent.timerTask

/**
 * desc:数据持有类
 */
public class TimeViewModel : ViewModel() {
    private val TAG = "TimeViewModel"
    private var timer: Timer?=null
    private var currentSecond=0
    var onTimeChangedListener:OnTimeChangeListener?=null

    /**
     * 开始计时
     */
    public fun startTiming() {
        if (timer==null){
            Log.e(TAG, "run: $currentSecond")
            currentSecond=0
            timer=Timer()
            val timerTask:TimerTask=object :TimerTask(){
                override fun run() {
                    currentSecond++
                    if (onTimeChangedListener!=null){
                        Log.e(TAG, "run: $currentSecond")
                        onTimeChangedListener!!.onTimeChanged(currentSecond)
                    }
                }
            }
            timer!!.schedule(timerTask,1000,1000)

        }
    }

    override fun onCleared() {
        super.onCleared()
        //非空才执行
        timer!!.cancel()
    }

    public interface OnTimeChangeListener{
        fun onTimeChanged(second:Int)
    }

}