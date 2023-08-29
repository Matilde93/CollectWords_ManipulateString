package com.example.firstlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.firstlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // important
    private val words = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonLower.setOnClickListener {
            var name = binding.editTextName.text.trim().toString().lowercase()
            if (name == "") {
                binding.editTextName.error = "Input word"
            }
            binding.textViewMessage.text = name
        }

        binding.buttonUpper.setOnClickListener {
            var name = binding.editTextName.text.trim().toString().uppercase()
            if (name == "") {
                binding.editTextName.error = "Input word"
            }
            binding.textViewMessage.text = name
        }

        binding.buttonCapitalize.setOnClickListener {
            var name = binding.editTextName.text.trim().toString().lowercase().capitalize()
            if (name == "") {
                binding.editTextName.error = "Input word"
            }
            binding.textViewMessage.text = name
        }

        binding.buttonReverse.setOnClickListener {
            var name = binding.editTextName.text.trim().toString().reversed()
            if (name == "") {
                binding.editTextName.error = "Input word"
            }
            binding.textViewMessage.text = name
        }

        binding.buttonSave.setOnClickListener {
            var word = binding.editTextName.text.trim().toString()
            if (word == "") {
                binding.editTextName.error = "Input word"
            }
            words.add(word)
            binding.textViewList.text = words.toString()
        }

        binding.buttonClear.setOnClickListener {
            words.clear()
            binding.textViewList.text = ""
        }


    }
}