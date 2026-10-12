package com.example.rejestracja

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.Zatwierdz)
        val wynik = findViewById<TextView>(R.id.wynik)
        val email = findViewById<EditText>(R.id.email)
        val haslo = findViewById<EditText>(R.id.password)
        val hasloPow = findViewById<EditText>(R.id.password2)
        button.setOnClickListener {
            if( haslo.text.toString() == hasloPow.text.toString() && haslo.text.toString()!=""
                ){
                wynik.text = "Witaj " + email.text.toString()
            }
            else{
                wynik.text = ""
            }
        }
    }
}