package com.qingtian.wanandroid.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.qingtian.wanandroid.R

/**
 * create by hqt on 2021/5/9 21:17
 * desc:
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return LayoutInflater.from(activity).inflate(R.layout.fragment_home, container, false)

    }
}