package com.example.android3lesson3dop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.android3lesson3dop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListener()
    }

    private fun setupListener() {
        binding.btnButton.setOnClickListener {
            Glide.with(binding.imgCat).load (
                "https://http.cat/${binding.etNum.text}"
            ).into(binding.imgCat)
        }
    }
}