package com.matheus.testecale

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
import com.matheus.testecale.databinding.FragmentFourBinding
import com.matheus.testecale.databinding.FragmentSixBinding
import kotlinx.coroutines.selects.whileSelect


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class sixFragment : Fragment() {

    private var _binding: FragmentSixBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentSixBinding.inflate(inflater, container, false)
        return binding.root


    }
    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioButton1 ->
                    if (checked) {
                        // Pirates are the best
                    }
                R.id.radioButton2 ->
                    if (checked) {
                        // Ninjas rule
                    }
            }
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}