package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val em = findViewById<TextView>(R.id.emailLogIn)
        val pas = findViewById<EditText>(R.id.passwordLogIn)
        val but = findViewById<TextView>(R.id.button2)

        em.text = intent.extras?.getString("email", "").toString()
        but.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
//            val nameText = pas.text.toString()

            val email = em.toString()

//            intent.putExtra("pas", nameText)
            intent.putExtra("email", email)
            startActivity(intent)

        }
    }

}