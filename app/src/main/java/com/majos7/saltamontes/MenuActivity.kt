package com.majos7.saltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(300)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        var btnNuevo = findViewById<Button>(R.id.btnNuevo)
        btnNuevo.setOnClickListener { onClickNuevo() }

        var btnEstadistica = findViewById<Button>(R.id.btnEsdistica)
        btnEstadistica.setOnClickListener { onClickEstadistica() }

        var btnAyuda = findViewById<Button>(R.id.btnAyuda)
        btnAyuda.setOnClickListener { onClickAyuda() }
    }

    private fun onClickAyuda() {
        var intent = Intent(this,HelpActivity::class.java)
        startActivity(intent)
    }

    private fun onClickEstadistica() {
        var intent = Intent(this,EstadisticasActivity::class.java)
        startActivity(intent)

    }

    private fun onClickNuevo() {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}