package com.ddr.jetpackdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 */
class SecondFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_second,container,false)
        val bundle=arguments;
        if (bundle!=null){
            val useName=MainFragmentArgs.fromBundle(bundle).userName
            val password=MainFragmentArgs.fromBundle(bundle).password
            val tvName=view.findViewById<TextView>(R.id.tvName)
            val tvPassword=view.findViewById<TextView>(R.id.tvPassword)
            tvName.text=useName
            tvPassword.text=password
        }
        return view
    }

}