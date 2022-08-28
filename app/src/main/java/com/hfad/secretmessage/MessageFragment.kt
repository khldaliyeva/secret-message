package com.hfad.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MessageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val btnNext = view.findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            view.findNavController().navigate(R.id.action_messageFragment_to_encryptFragment)
        }

        return view
    }

}
