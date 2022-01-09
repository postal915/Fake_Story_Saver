package com.example.fakestorysaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.fakestorysaver.databinding.ActivityMainBinding
import com.example.fakestorysaver.del.NumberAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: NumberAdapter
    private lateinit var tabLayout: TabLayout
    private val tabNames: Array<String> = arrayOf("story", "following", "feed")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = NumberAdapter(this)
        binding.pager.adapter = adapter

        tabLayout = findViewById(R.id.tabLayouts)
        TabLayoutMediator(tabLayout, binding.pager) { tab, position ->
            tab.text = tabNames[position]
        }.attach()

    }
}