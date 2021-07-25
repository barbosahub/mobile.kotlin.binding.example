package com.android.binding.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.android.binding.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitbutton.setOnClickListener {
            display()
        }
    }

    private fun display() {
        binding.apply {
            greetingtextview.text = "Bem vindo! " + nameedittext.text
        }
    }
}