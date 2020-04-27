package com.yong.navigationswipe.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yong.navigationswipe.R


/**
 * A simple [Fragment] subclass.
 * Use the [SettingFirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingFirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting_first, container, false)
    }

}
