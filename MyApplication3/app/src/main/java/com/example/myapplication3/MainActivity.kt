package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.emailSignUp)
        val button = findViewById<TextView>(R.id.button1)
        button.setOnClickListener {
            val emeilText = email.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("email", emeilText)
            startActivity(intent)
        }
    }
}