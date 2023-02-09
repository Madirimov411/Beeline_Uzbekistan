package com.uzb7.beelineuzbekistan.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.uzb7.beelineuzbekistan.R
import com.uzb7.beelineuzbekistan.databinding.FragmentHomeBinding
import com.uzb7.beelineuzbekistan.utils.viewBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.apply {
            bClick.setOnClickListener {
                val bundle = Bundle()
                val name=etName.text.toString()
                bundle.putString("name", name)
                findNavController().navigate(R.id.action_homeFragment_to_detailsFragment,bundle)
            }
        }
    }

}