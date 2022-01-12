package com.example.fakestorysaver.del

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fakestorysaver.R
import com.example.fakestorysaver.adapter.RecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_number.*

class NumberFragment : Fragment() {

    private val adapter by lazy { RecyclerViewAdapter(requireContext()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_number, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        setupRecyclerViewAdapter()
    }

    private fun setupRecyclerViewAdapter() {
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}