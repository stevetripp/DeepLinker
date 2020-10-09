package com.vikingsen.deeplinker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vikingsen.deeplinker.databinding.LobbyFragmentBinding

class LobbyFragment: Fragment() {

    private lateinit var binding: LobbyFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = LobbyFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.level1Button.setOnClickListener {
            findNavController().navigate(LobbyFragmentDirections.actionToLevel1Fragment("YELLOW"))
        }
        binding.level2Button.setOnClickListener {
            findNavController().navigate(Level2Fragment.getElevatorUri("GREEN"))
        }
    }
}