package com.re.application.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.re.application.databinding.AndroidFragmentBinding

class AndroidFragment : Fragment() {

    private var _binding: AndroidFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = AndroidFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}