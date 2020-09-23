package com.ddr.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    private lateinit var myLocationListener:MyLocationListener
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLocationListener=MyLocationListener(this, object :MyLocationListener.OnLocationChangedListener{
            override fun onChanged(latitude: Double, longitude: Double) {
                //TODO("Not yet implemented")
                //展示收到的消息
            }
        })
        //将观察者组件和被观察者Activity绑定
        lifecycle.addObserver(myLocationListener)
        navController=Navigation.findNavController(this,R.id.nav_host_fragment)
        appBarConfiguration= AppBarConfiguration.Builder(navController.graph).build()
        NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration)

        navController.addOnDestinationChangedListener(NavController.OnDestinationChangedListener { controller, destination, arguments ->
            //
            Log.d(TAG, "onCreate: 页面切换${destination.displayName}")
        })

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,navController)||super.onOptionsItemSelected(item)
    }


    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController,appBarConfiguration)|| super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_settings,menu)
        return true

    }
}