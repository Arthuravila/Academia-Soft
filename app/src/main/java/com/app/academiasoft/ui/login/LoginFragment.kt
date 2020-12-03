package com.app.academiasoft.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.app.academiasoft.R
import com.app.academiasoft.databinding.FragmentLoginBinding
import com.app.academiasoft.ui.home.HomeFragmentDirections
import com.app.financialplayground.core.base.BaseFragment

class LoginFragment : BaseFragment<FragmentLoginBinding>(R.layout.fragment_login) {

    private val args: LoginFragmentArgs by navArgs()

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
        binding.buttonEntrar.setOnClickListener {
            when (args.type){
                "Aluno" -> findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToTrainingFragment())
                else -> findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToInstructorFragment())
            }
        }
    }
}