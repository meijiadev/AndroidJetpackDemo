package com.ddr.androidjetpackdemo

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

public class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //将观察者ApplicationObserver和被观察者MyApplication绑定
        ProcessLifecycleOwner.get().lifecycle.addObserver(ApplicationObserver())
    }
}