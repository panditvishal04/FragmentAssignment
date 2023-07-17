package com.vishal.fragmentassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import com.vishal.fragmentassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var fragmentInterface:FragmentInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPass.setOnClickListener {
            if (binding.etName.text.toString().isEmpty()) {
                binding.etName.error = "this field is not optional"
            }
            else
            {
                fragmentInterface.changeFragmentText(binding.etName.text.toString())

            }
        }
        binding.btnPlus.setOnClickListener {
            fragmentInterface.plus()
        }
        binding.btnMinus.setOnClickListener {
            fragmentInterface.minus()
        }
    }
    fun clearActivityData() {
        binding.etName.setText("")
    }
}