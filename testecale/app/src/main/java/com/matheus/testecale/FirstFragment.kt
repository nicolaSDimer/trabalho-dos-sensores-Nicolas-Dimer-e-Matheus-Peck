package com.matheus.testecale

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.matheus.testecale.databinding.FragmentFirstBinding
import kotlinx.coroutines.selects.whileSelect


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root



    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.button6.setOnClickListener {
            findNavController().navigate(R.id.SecondFragment)
        }
        binding.button5.setOnClickListener {
            findNavController().navigate(R.id.login)
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}