package com.majos7.saltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnNuevo = findViewById<Button>(R.id.btnNuevo)
        btnNuevo.setOnClickListener { onClickNuevo() }
    }

    private fun onClickNuevo() {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}