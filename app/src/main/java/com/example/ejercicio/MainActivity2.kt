package com.example.ejercicio

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.ejercicio.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val numero1 = binding.tietNumero1.text.toString().toDouble()
            val numero2 = binding.tietNumero2.text.toString().toDouble()

            when (checkedId) {
                binding.radioButtonSumar.id -> {

                }
                binding.radioButtonRestar.id -> {

                }
                binding.radioButtonMultiplicar.id -> {

                }
                binding.radioButtonDividir.id -> {

                }
            }
        }
    }

    fun sumar(numero1: Double, numero2: Double): Double = numero1 + numero2

    fun restar(numero1: Double, numero2: Double): Double = numero1 - numero2

    fun multiplicar(numero1: Double, numero2: Double): Double = numero1 * numero2

    fun dividir(numero1: Double, numero2: Double): Double = numero1 / numero2
}