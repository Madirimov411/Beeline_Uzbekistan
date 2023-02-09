package com.uzb7.beelineuzbekistan.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.uzb7.beelineuzbekistan.R
import com.uzb7.beelineuzbekistan.databinding.FragmentDetailsBinding
import com.uzb7.beelineuzbekistan.utils.viewBinding

class DetailsFragment : Fragment(R.layout.fragment_details) {
    val binding by viewBinding { FragmentDetailsBinding.bind(it) }
    val args: DetailsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        val s = args.name
        binding.apply {
            tvName.text = s
        }

    }


}