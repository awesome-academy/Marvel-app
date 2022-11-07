package com.ndt.marvelapp.ui

import android.os.Bundle
import android.view.Window
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.ndt.marvelapp.R
import com.ndt.marvelapp.base.BaseActivity
import com.ndt.marvelapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE)
        setTheme(R.style.Theme_MarvelApp)
        setContentView(binding.root)
    }

    override fun initData() {
        TODO("Not yet implemented")
    }

    override fun handleEvent() {
        TODO("Not yet implemented")
    }

    override fun bindData() {
        viewBinding.apply {
            val navController = findNavController(R.id.fragment_nav_host)
            binding.bottomNavigationView.setupWithNavController(navController)
        }
    }
}
