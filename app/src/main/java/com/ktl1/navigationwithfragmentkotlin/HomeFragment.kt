package com.ktl1.navigationwithfragmentkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.ktl1.navigationwithfragmentkotlin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            if (binding.etName.text.isNotEmpty()) {
                val bundle = bundleOf("user_input" to binding.etName.text.toString())
                it.findNavController().navigate(
                    R.id.action_homeFragment_to_secondFragment,
                    bundle
                ) // use this code for navigate fragment to another fragment
            } else {
                Toast.makeText(activity, "Please insert Data", Toast.LENGTH_LONG).show()
            }
        }
        return binding.root
    }

}