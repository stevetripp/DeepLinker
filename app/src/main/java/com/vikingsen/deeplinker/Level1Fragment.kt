package com.vikingsen.deeplinker

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.vikingsen.deeplinker.databinding.Level1FragmentBinding

class Level1Fragment : Fragment() {

    private lateinit var binding: Level1FragmentBinding
    private val args by navArgs<Level1FragmentArgs>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = Level1FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.level1TextView.text = getString(R.string.code, args.code1)
        binding.level2Button.setOnClickListener {
            findNavController().navigate(Level1FragmentDirections.actionToLevel2Fragment("GREEN"))
        }
    }

    companion object {
        fun getUri(code: String): Uri {
            return "deeplinker://building/level1/$code".toUri()
        }
    }
}