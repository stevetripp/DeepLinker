package com.vikingsen.deeplinker

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vikingsen.deeplinker.databinding.OutsideFragmentBinding

class OutsideFragment : Fragment() {

    private lateinit var binding: OutsideFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = OutsideFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.lobbyButton.setOnClickListener {
            findNavController().navigate(OutsideFragmentDirections.actionToLobbyFragment())
        }
        binding.level1Button.setOnClickListener {
            findNavController().navigate(Level1Fragment.getUri("BLUE"))
        }
        binding.level2Button.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Level2Fragment.getOutsideUri("RED", "YELLOW")).apply {
//                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }
    }
}