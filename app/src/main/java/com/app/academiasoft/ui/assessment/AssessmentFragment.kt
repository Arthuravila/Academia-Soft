package com.app.academiasoft.ui.assessment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.academiasoft.R
import com.app.academiasoft.databinding.FragmentAssessmentBinding
import com.app.financialplayground.core.base.BaseFragment

class AssessmentFragment :
    BaseFragment<FragmentAssessmentBinding>(R.layout.fragment_assessment) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding.root
    }
}