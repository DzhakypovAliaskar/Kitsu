package com.example.kitsu.presentation.extentions

import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.kitsu.R


fun Fragment.mainNavController() = requireActivity().findNavController(R.id.nav_host_fragment)