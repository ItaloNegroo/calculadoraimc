package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variavele associar (=) o componente do UI<EditText>
        // Recuperar o botão da tela

        // Colocar ação no botão setOnClickListener
        // Recuperar o texto digitando no edt peso


        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)


        btnCalcular.setOnClickListener {
            val peso: Float = edtpeso.text. toString().toFloat()
            val altura:Float = edtaltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2

            println(" ação do botão " + resultado )
        }


    }
}