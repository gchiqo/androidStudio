package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<TextView>(R.id.emailLast).text = intent.extras?.getString("emaill").toString()
        findViewById<TextView>(R.id.numberLast).text = intent.extras?.getString("pass").toString()
    }
}