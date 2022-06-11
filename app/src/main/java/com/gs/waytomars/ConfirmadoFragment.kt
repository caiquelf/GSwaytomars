package com.gs.waytomars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.gs.waytomars.databinding.FragmentConfirmadoBinding
import com.gs.waytomars.databinding.FragmentHomeBinding


class ConfirmadoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentConfirmadoBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_confirmado,container,false)
        binding.btInformacoes.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_confirmadoFragment_to_marteFragment)
        }
        return binding.root
    }
    }
