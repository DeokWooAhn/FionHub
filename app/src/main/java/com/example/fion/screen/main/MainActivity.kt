package com.example.fion.screen.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.fion.R
import com.example.fion.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() = with(binding) {
        bottomNav.setOnItemSelectedListener(this@MainActivity)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.menu_user -> {
                true
            }
            R.id.menu_player -> {
                true
            }
            else -> false
        }
    }
}