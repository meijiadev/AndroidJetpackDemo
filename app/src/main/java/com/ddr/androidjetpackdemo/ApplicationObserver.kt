package com.ddr.androidjetpackdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * desc: 监听整个app
 */
public class ApplicationObserver : LifecycleObserver {
    private val TAG = "ApplicationObserver"

    /**
     * 在应用程序第一次启动时调用，只会执行一次
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public fun onCreate(){
        Log.d(TAG, "onCreate:")
    }


    /**
     * 当应用程序出现前台时被调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public fun onStart(){
        Log.d(TAG, "onStart: ")
    }


    /**
     * 当应用程序出现前台时调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public fun onResume(){
        Log.d(TAG, "onResume: ")
    }

    /**
     * 当应用程序退出到后台时调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public fun onPause(){
        Log.d(TAG, "onPause: ")
    }

    /**
     * 当程序退到后台时调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public fun onStop(){
        Log.d(TAG, "onStop: ")
    }

    /**
     * 永远不会调用，系统不会分发该事件
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public fun onDestroy(){

    }



}