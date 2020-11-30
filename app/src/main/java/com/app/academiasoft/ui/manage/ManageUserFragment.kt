package com.app.academiasoft.ui.manage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.academiasoft.R
import com.app.academiasoft.databinding.FragmentManageBinding
import com.app.financialplayground.core.base.BaseFragment

class ManageUserFragment : BaseFragment<FragmentManageBinding>(R.layout.fragment_manage) {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        setClickListeners()
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun subscribeUi() {
    }

    private fun setClickListeners() {
        binding.buttonCriar.setOnClickListener {

        }

        binding.buttonDeletar.setOnClickListener {

        }

        binding.buttonAtualizar.setOnClickListener {

        }

        binding.buttonBuscar.setOnClickListener {

        }
    }
}