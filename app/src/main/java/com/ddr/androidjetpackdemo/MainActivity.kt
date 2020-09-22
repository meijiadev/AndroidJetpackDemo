package com.ddr.androidjetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var myLocationListener:MyLocationListener


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLocationListener=MyLocationListener(this, object :MyLocationListener.OnLocationChangedListener{
            override fun onChanged(latitude: Double, longitude: Double) {
                TODO("Not yet implemented")
                //展示收到的消息
            }
        })
        //将观察者组件和被观察者Activity绑定
        lifecycle.addObserver(myLocationListener)
    }

}