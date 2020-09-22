package com.ddr.androidjetpackdemo

import android.app.Activity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import java.security.AccessControlContext

/**
 * desc：导航组件（模拟）
 */
public class MyLocationListener(context: Activity, onLocationChangedListener: OnLocationChangedListener) : LifecycleObserver{

    init {
        initLocationManager()
    }

    /**
     * 初始化导航参数
     */
    private fun  initLocationManager(){

    }

    /**
     * 当Activity执行onResume*方法时，该方法会被自动调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private fun startGetLocation(){

    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private fun stopGetLocation () {

    }

    /**
     * 当地理位置发生变化时通知实现者
     */
    public interface OnLocationChangedListener {
        fun onChanged(latitude : Double,longitude:Double)
    }
}