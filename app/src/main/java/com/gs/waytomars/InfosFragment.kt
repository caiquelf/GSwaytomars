package com.gs.waytomars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.gs.waytomars.databinding.FragmentInfosBinding


class InfosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding:FragmentInfosBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_infos,container,false)

        binding.btInformacoes.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_infosFragment_to_marteFragment)
        }
        binding.btComprar.setOnClickListener{
            view?.findNavController()?.navigate(R.id.action_infosFragment_to_comprarFragment)
        }
        return binding.root
        }
}