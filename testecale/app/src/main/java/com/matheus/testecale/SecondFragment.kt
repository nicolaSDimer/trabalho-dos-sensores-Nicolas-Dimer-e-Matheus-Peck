package com.matheus.testecale

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.google.android.gms.location.FusedLocationProviderClient
import com.matheus.testecale.databinding.FragmentSecondBinding
import kotlin.String.Companion as String1

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root



    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var time = Toast.LENGTH_SHORT
        var msg = "Cadastro"
        val toast = Toast.makeText(context, msg, time)
        toast.show()
        binding.button3.setOnClickListener {
                findNavController().navigate(R.id.fourFragment)
        }
        binding.textView10.setOnClickListener{
            findNavController().navigate(R.id.login)
        }
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}