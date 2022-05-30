package com.ktl1.navigationwithfragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktl1.navigationwithfragmentkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // add binding to MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}