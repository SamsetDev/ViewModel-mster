package com.viewmodel.sample.views

import android.os.Bundle

import com.viewmodel.sample.R
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.viewmodel.sample.utils.Constants.generateRandomColor
import com.viewmodel.sample.viewmodels.MyViewModel
import com.viewmodel.sample.viewmodels.ViewModelFractory
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Copyright (C) ViewModel-master - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited Proprietary and confidential.
 *
 *
 * Created by samset on 06/03/19 at 5:03 PM for ViewModel-master .
 */


class FactoryActivity : AppCompatActivity() {
    private lateinit var factoryviewmodel: ViewModelFractory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        factoryviewmodel = ViewModelFractory()
        factoryviewmodel.setColorResource(generateRandomColor())
        val myViewModel = ViewModelProviders.of(this, factoryviewmodel).get(MyViewModel::class.java)
        mainlayout.setBackgroundColor(myViewModel.getColorResource())

    }
}
