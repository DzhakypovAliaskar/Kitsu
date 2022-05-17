package com.example.kitsu.presentation.ui.fragments.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsu.R
import com.example.kitsu.databinding.FragmentSignInBinding
import com.example.kitsu.presentation.base.BaseFragment
import com.example.kitsu.presentation.extentions.mainNavController
import com.example.kitsu.presentation.extentions.navigateSafely
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment :
    BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {
    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignInViewModel by viewModels()

    override fun launchObservers() {
        subscribeToAuthorization()
    }

    private fun subscribeToAuthorization() {
        viewModel.signInState.spectateUiState(error = {
            Toast.makeText(
                requireActivity(),
                "An unexpected error occurred! Try authenticating again",
                Toast.LENGTH_SHORT
            ).show()
        },
            success = {
                mainNavController().navigateSafely(R.id.action_signInFlowFragment_to_mainFlowFragment)

            }, gatherIfSucceed = {
                it.setupViewVisibility(binding.constraint, binding.progressbar)
            })
    }

    override fun setupListeners() {
        binding.btnSignIn.setOnClickListener {
            viewModel.signIn(binding.etEmail.text.toString(), binding.etPassword.text.toString())
        }
    }
}