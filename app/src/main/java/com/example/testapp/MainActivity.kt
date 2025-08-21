package com.example.testapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtNumber.text = number.toString()

            // increase number
            btnCount.setOnClickListener{
                number++
                txtNumber.text = number.toString()
            }
            // subtract number
            btnSubtract.setOnClickListener {
                number--
                txtNumber.text = number.toString()
            }
            // adding 2
            btnAdd2.setOnClickListener {
                number += 2
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity,"Sekarang angka $number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}