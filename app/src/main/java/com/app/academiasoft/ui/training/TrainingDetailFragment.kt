package com.app.academiasoft.ui.training

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.academiasoft.R
import com.app.academiasoft.databinding.FragmentTrainingDetailBinding
import com.app.financialplayground.core.base.BaseFragment

class TrainingDetailFragment :
    BaseFragment<FragmentTrainingDetailBinding>(R.layout.fragment_training_detail) {

    private lateinit var trainingAdapter: TrainingAdapter
    private val trainingList = mutableListOf(Training())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        trainingAdapter = TrainingAdapter(trainingList)

        binding.trainingRv.apply {
            adapter = trainingAdapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

        return binding.root
    }
}