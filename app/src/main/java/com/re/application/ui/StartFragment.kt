package com.re.application.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.re.application.R
import com.re.application.databinding.StartFragmentBinding

class StartFragment : Fragment() {

    private var _binding: StartFragmentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = StartFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.cardID.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_kotlinFragment)
        }
        binding.cardID2.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_androidFragment)
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}