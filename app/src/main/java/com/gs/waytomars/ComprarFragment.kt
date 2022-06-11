package com.gs.waytomars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.gs.waytomars.databinding.FragmentComprarBinding
import com.gs.waytomars.databinding.FragmentHomeBinding


class ComprarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentComprarBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_comprar,container,false)
        binding.btComprar.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_comprarFragment_to_confirmadoFragment)
        }
        return binding.root
    }
}