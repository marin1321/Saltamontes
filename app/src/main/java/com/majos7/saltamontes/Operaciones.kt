package com.majos7.saltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Operaciones : AppCompatActivity()  {
    var listEstudiantes= ArrayList<Estudiante>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    fun registar(estudiante:Estudiante) {
        listEstudiantes.add(estudiante)
    }

    fun getList(): ArrayList<Estudiante> {
        return listEstudiantes
    }
}