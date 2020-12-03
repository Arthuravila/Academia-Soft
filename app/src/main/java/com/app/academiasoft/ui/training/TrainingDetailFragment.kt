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
import kotlinx.android.synthetic.main.fragment_training_detail.*

class TrainingDetailFragment :
    BaseFragment<FragmentTrainingDetailBinding>(R.layout.fragment_training_detail) {

    private lateinit var adapter: TrainingAdapter
    private val trainingList = mutableListOf(Training())

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

        adapter = TrainingAdapter(trainingList)

        trainingRv.apply {
            adapter = this@TrainingDetailFragment.adapter
            layoutManager = LinearLayoutManager(context)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }

}