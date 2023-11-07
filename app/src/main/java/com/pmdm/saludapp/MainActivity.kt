package com.pmdm.saludapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnhello: Button = findViewById(R.id.btnhello)
        val etName: EditText = findViewById(R.id.etname)
        btnhello.setOnClickListener {
            //Log.i("Test", "UA")
            val name = etName.text.toString()
            if (name.isNotEmpty()) {
                Snackbar.make(btnhello, "Hola $name!", Snackbar.LENGTH_LONG)
                    .setAnchorView(etName)
                    .setAction("RESET") { etName.setText(null) }
                    .show()
            } else {
                Toast.makeText(this, "Introduce un nombre", Toast.LENGTH_LONG).show()
            }
        }
    }
}

//Snackbar.make(btnhello, "Hola $name!", Snackbar.LENGTH_LONG)
//.setAnchorView(btnhello)
//.setAction("CLOSE") { finishAffinity() }
//.show()