package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("myTag", "onCreate")

        var nameee = findViewById<EditText>(R.id.nameee)

//        findViewById<Button>(R.id.buttonn).setOnKeyListener{
//            val name = nameee.text.toString()
//        }






    }

    override fun onStart() {
        super.onStart()
        Log.d("myTag", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("myTag", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("myTag", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myTag", "onDestroy")
    }
}