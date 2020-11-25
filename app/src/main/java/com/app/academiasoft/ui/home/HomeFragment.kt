package com.app.academiasoft.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.academiasoft.R
import com.app.academiasoft.databinding.FragmentHomeBinding
import com.app.financialplayground.core.base.BaseFragment
import com.app.financialplayground.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private val homeViewModel: HomeViewModel by viewModel()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun subscribeUi() {
    }

    private fun setClickListeners() {
        binding.button.setOnClickListener {}
    }
}
