package com.example.paramfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.paramfragment.databinding.FragmentABinding

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding:FragmentABinding = DataBindingUtil.inflate(inflater,R.layout.fragment_a, container, false)

        binding.btnSend.setOnClickListener(){
            val name = binding.tfName.text.toString()
            val action = AFragmentDirections.actionAFragmentToBFragment(name)
            Navigation.findNavController(it).navigate(action)

        }

        return binding.root
    }

}