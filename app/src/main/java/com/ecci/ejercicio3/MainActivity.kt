package com.ecci.ejercicio3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_verde : Button = findViewById(R.id.Botton_verde)
        val button_azul : Button = findViewById(R.id.Botton_azul)
        val button_rosado : Button = findViewById(R.id.Botton_rosado)
        val button_rojo : Button = findViewById(R.id.Botton_Rojo)
        val button_amarillo : Button = findViewById(R.id.Botton_Amarillo)
        val descrp_textVienw = findViewById<TextView>(R.id.descrp_textVienw)
        val esc_EditText = findViewById<EditText>(R.id.esc_EditText)

        button_verde.setOnClickListener{
            button_verde.background = resources.getDrawable(R.drawable.botton_background_rojo)
            val caja_text = esc_EditText.text.toString()
            if (caja_text == ""){
                descrp_textVienw.text = "Debe ingresar su nombre"
                descrp_textVienw.setTextColor(resources.getColor(R.color.black))
                return@setOnClickListener
            }
             descrp_textVienw.text = esc_EditText.text
             esc_EditText.setText("")
            descrp_textVienw.setTextColor(resources.getColor(R.color.rojo))
        }
        button_azul.setOnClickListener{
            button_azul.background = resources.getDrawable(R.drawable.botton_background_rosado)
            val caja_text = esc_EditText.text.toString()
            if (caja_text == ""){
                descrp_textVienw.text = "Debe ingresar su nombre"
                descrp_textVienw.setTextColor(resources.getColor(R.color.black))
                return@setOnClickListener
            }
            descrp_textVienw.text = esc_EditText.text
            esc_EditText.setText("")
            descrp_textVienw.setTextColor(resources.getColor(R.color.rosado))
        }
        button_amarillo.setOnClickListener{
            button_amarillo.background = resources.getDrawable(R.drawable.botton_background_azul)
            val caja_text = esc_EditText.text.toString()
            if (caja_text == ""){
                descrp_textVienw.text = "Debe ingresar su nombre"
                descrp_textVienw.setTextColor(resources.getColor(R.color.black))
                return@setOnClickListener
            }
            descrp_textVienw.text = esc_EditText.text
            esc_EditText.setText("")
            descrp_textVienw.setTextColor(resources.getColor(R.color.azul))
        }
        button_rojo.setOnClickListener{
            button_rojo.background = resources.getDrawable(R.drawable.botton_background_amarillo)
            val caja_text = esc_EditText.text.toString()
            if (caja_text == ""){
                descrp_textVienw.text = "Debe ingresar su nombre"
                descrp_textVienw.setTextColor(resources.getColor(R.color.black))
                return@setOnClickListener
            }
            descrp_textVienw.text = esc_EditText.text
            esc_EditText.setText("")
            descrp_textVienw.setTextColor(resources.getColor(R.color.amarillo))
        }
        button_rosado.setOnClickListener{
            button_rosado.background = resources.getDrawable(R.drawable.botton_background_verde)
            val caja_text = esc_EditText.text.toString()
            if (caja_text == ""){
                descrp_textVienw.text = "Debe ingresar su nombre"
                descrp_textVienw.setTextColor(resources.getColor(R.color.black))
                return@setOnClickListener
            }
            descrp_textVienw.text = esc_EditText.text
            esc_EditText.setText("")
            descrp_textVienw.setTextColor(resources.getColor(R.color.verde))
        }
    }
}