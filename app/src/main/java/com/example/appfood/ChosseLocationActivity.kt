package com.example.appfood

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appfood.databinding.ActivityChosseLocationBinding
import com.example.appfood.databinding.ActivityLoginBinding

class ChosseLocationActivity : AppCompatActivity() {
    private val binding:ActivityChosseLocationBinding by lazy {
        ActivityChosseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
            val locationList = arrayOf("Ha Noi", "TP Ho Chi Minh","Ha Tinh", "Thanh Hoa")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
        }
    }