package com.majos7.saltamontes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EstadisticasActivity : AppCompatActivity() {
    var operaciones:Operaciones= Operaciones()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        var txt= findViewById<TextView>(R.id.txt)

        var lista=operaciones.getList()

        var cantidad=lista.size

        txt.text="$cantidad"
    }
}