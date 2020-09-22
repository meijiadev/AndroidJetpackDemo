package com.ddr.jetpackdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() ,View.OnClickListener{
    private lateinit var btToSecondFragment:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_main, container, false)
        btToSecondFragment=view.findViewById(R.id.btToSecondFragment)
        btToSecondFragment.setOnClickListener(this)
        return view;
    }

    /**
     * 点击事件
     */
    override fun onClick(view: View?) {
        //TODO("Not yet implemented")
        //导航到目的地 方法一
        //Navigation.findNavController(btToSecondFragment).navigate(R.id.action_mainFragment_to_secondFragment)
        //方法二
        this.findNavController()
            .navigate(R.id.action_mainFragment_to_secondFragment)

    }

}