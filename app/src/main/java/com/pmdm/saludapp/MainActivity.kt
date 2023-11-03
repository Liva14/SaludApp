package com.pmdm.saludapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnhello: Button = findViewById(R.id.btnhello)
        val etName: EditText = findViewById(R.id.etname)
        btnhello.setOnClickListener {
            //Log.i("Test", "UA")
            val name = etName.text.toString()
            Toast.makeText(this, "Hola $name!", Toast.LENGTH_LONG).show()
        }
    }
}