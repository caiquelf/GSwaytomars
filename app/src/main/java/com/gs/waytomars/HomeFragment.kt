package com.gs.waytomars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.gs.waytomars.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val binding:FragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        binding.btAcessar.setOnClickListener{
        view?.findNavController()?.navigate(R.id.action_homeFragment_to_infosFragment)
        }
        return binding.root
    }
}