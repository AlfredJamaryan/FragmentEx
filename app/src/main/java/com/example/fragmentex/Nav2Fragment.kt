package com.example.fragmentex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.fragmentex.databinding.FragmentNav2Binding


class Nav2Fragment : Fragment(), View.OnClickListener {
    var sum = 2
    lateinit var print: String
    lateinit var binding: FragmentNav2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNav2Binding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.i1j1.setOnClickListener(this)
        binding.i2j1.setOnClickListener(this)
        binding.i3j1.setOnClickListener(this)
        binding.i1j2.setOnClickListener(this)
        binding.i2j2.setOnClickListener(this)
        binding.i3j2.setOnClickListener(this)
        binding.i1j3.setOnClickListener(this)
        binding.i2j3.setOnClickListener(this)
        binding.i3j3.setOnClickListener(this)
        binding.buttonBack.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.buttonBack -> {
                findNavController().navigate(Nav2FragmentDirections.actionNav2FragmentToNav1Fragment())

            }
            R.id.i1j1 -> {
                xOrO()
                sum++
                val textView = view.findViewById<TextView>(R.id.i1j1)
                textView.setText(print).toString()

            }
            R.id.i2j1 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i2j1)
                textView.setText(print).toString()
                sum++

            }
            R.id.i3j1 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i3j1)
                textView.setText(print).toString()
                sum++
            }
            R.id.i1j2 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i1j2)
                textView.setText(print).toString()
                sum++
            }
            R.id.i2j2 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i2j2)
                textView.setText(print).toString()
                sum++
            }
            R.id.i3j2 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i3j2)
                textView.setText(print).toString()
                sum++
            }
            R.id.i1j3 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i1j3)
                textView.setText(print).toString()
                sum++
            }
            R.id.i2j3 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i2j3)
                textView.setText(print).toString()
                sum++
            }
            R.id.i3j3 -> {
                xOrO()
                val textView = view.findViewById<TextView>(R.id.i3j3)
                textView.setText(print).toString()
                sum++
            }
        }

    }

    fun xOrO() {
        if (sum % 2 == 0) {
            print = "X"
        } else {
            print = "O"
        }
    }
}


