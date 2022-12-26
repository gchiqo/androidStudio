package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity


class start_page : AppCompatActivity() {

    lateinit var chG: CheckBox
    lateinit var chD: CheckBox
    lateinit var chH: CheckBox
    lateinit var chY: CheckBox
    lateinit var hir: Button
    lateinit var kat: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)

        chG = findViewById<CheckBox>(R.id.Gojūon)
        chD = findViewById<CheckBox>(R.id.Dakuon)
        chH = findViewById<CheckBox>(R.id.Handakuon)
        chY = findViewById<CheckBox>(R.id.Yōon)
        hir = findViewById<Button>(R.id.hiragana)
        kat = findViewById<Button>(R.id.katagana)

        hir.setOnClickListener{ intent.putExtra("letters", "hir"); things() }
        kat.setOnClickListener{ intent.putExtra("letters", "kat"); things() }
    }
    fun things(){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("chG", chG.isChecked)
        intent.putExtra("chG", chD.isChecked)
        intent.putExtra("chG", chH.isChecked)
        intent.putExtra("chG", chY.isChecked)
        startActivity(intent)
    }

}