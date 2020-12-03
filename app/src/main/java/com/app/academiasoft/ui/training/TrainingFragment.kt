package com.app.academiasoft.ui.training

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app.academiasoft.R
import com.app.academiasoft.databinding.FragmentTrainingBinding
import com.app.academiasoft.ui.home.HomeFragmentDirections
import com.app.financialplayground.core.base.BaseFragment

class TrainingFragment : BaseFragment<FragmentTrainingBinding>(R.layout.fragment_training) {

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
        binding.buttonTrainingList.setOnClickListener {
            findNavController().navigate(R.id.action_trainingFragment_to_trainingDetailFragment)
        }
    }
}