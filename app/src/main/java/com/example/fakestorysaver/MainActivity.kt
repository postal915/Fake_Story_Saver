package com.example.fakestorysaver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fakestorysaver.adapter.TabLayoutAdapter
import com.example.fakestorysaver.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: TabLayoutAdapter
    private val tabNames: Array<String> = arrayOf("story", "following", "feed")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTabLayoutAdapter()
    }

    private fun setTabLayoutAdapter() {
        adapter = TabLayoutAdapter(this)
        binding.pager.adapter = adapter

        TabLayoutMediator(binding.tabLayouts, binding.pager) { tab, position ->
            tab.text = tabNames[position]
        }.attach()
    }
}