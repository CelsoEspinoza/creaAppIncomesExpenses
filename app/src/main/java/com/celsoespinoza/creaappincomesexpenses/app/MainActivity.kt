package com.celsoespinoza.creaappincomesexpenses.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.celsoespinoza.creaappincomesexpenses.R
import com.celsoespinoza.creaappincomesexpenses.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.helloWorld = "Hola Mundo"
    }
}