package com.shakibaenur.pinedittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val circleField = findViewById<PinField>(R.id.et)
        val listener = object : PinField.OnTextCompleteListener{
            override fun onTextComplete(enteredText: String): Boolean {
                Toast.makeText(this@MainActivity,enteredText, Toast.LENGTH_SHORT).show()
                return@onTextComplete true
            }

        }
        circleField.onTextCompleteListener = listener
    }
}