package com.example.calculadora1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var lblNum1: EditText
    lateinit var lblNum2: EditText
    lateinit var lbnCalculo: TextView
    lateinit var btnSuma: Button
    lateinit var btnResta: Button
    lateinit var btnMulti: Button
    lateinit var btnDivi: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val vinculo = ActivityMainBinding.inflate(layoutInflater)

        lblNum1 = vinculo.lblNum1
        lblNum2 = vinculo.lblNum2
        lbnCalculo = vinculo.lbnCalculo


        btnSuma.setOnClickListener { view ->

            sumDatos(view)
        }

        btnResta.setOnClickListener { view ->

            resDatos(view)
        }

        btnMulti.setOnClickListener { view ->

            mulDatos(view)
        }
        setContentView(vinculo.root)
    }

    fun sumDatos(view: View){

        val Resultado = lblNum1.text.toString().toBigDecimal() + lblNum2.text.toString().toBigDecimal()
        lbnCalculo.setText(Resultado.toString())
    }

    fun resDatos(view: View){

        val Resultado = lblNum1.text.toString().toBigDecimal() - lblNum2.text.toString().toBigDecimal()
        lbnCalculo.setText(Resultado.toString())
    }

    fun mulDatos(view: View){

        val Resultado = lblNum1.text.toString().toBigDecimal() * lblNum2.text.toString().toBigDecimal()
        lbnCalculo.setText(Resultado.toString())
    }
}