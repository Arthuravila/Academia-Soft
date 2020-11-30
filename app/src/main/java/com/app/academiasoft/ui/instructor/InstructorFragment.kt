package com.app.academiasoft.ui.instructor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app.academiasoft.R
import com.app.academiasoft.databinding.FragmentInstructorBinding
import com.app.financialplayground.core.base.BaseFragment

class InstructorFragment : BaseFragment<FragmentInstructorBinding>(R.layout.fragment_instructor) {

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
        binding.buttonGerenciar.setOnClickListener {
            findNavController().navigate(R.id.action_instructorFragment_to_manageUserFragment)
        }

        binding.buttonAvaliar.setOnClickListener {

        }
    }
}