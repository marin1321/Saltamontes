package com.majos7.saltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class EstadisticasActivity : AppCompatActivity() {
    var lista=Operaciones.listEstudiantes
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        var total = findViewById<TextView>(R.id.total)
        var ganadores = findViewById<TextView>(R.id.ganar)
        var perdedores = findViewById<TextView>(R.id.perder)
        var recuperar = findViewById<TextView>(R.id.recuperar)
        var btnSalir = findViewById<Button>(R.id.salirE)
        btnSalir.setOnClickListener { onClick() }

        var cantidadTotal=lista.size
        var cantidadGanados:Int=totalGanadores()
        var cantidadPerdedores:Int=totalPerdedores()
        var cantidadRecuperacion:Int=totalRecuperacion()

        total.text="$cantidadTotal"
        ganadores.text="$cantidadGanados"
        perdedores.text="$cantidadPerdedores"
        recuperar.text="$cantidadRecuperacion"
    }

    private fun totalRecuperacion(): Int {
        var cantidad=0
        for (est in lista){
            if (est.recuperacion==true){
                cantidad=cantidad+1
            }
        }

        return cantidad
    }

    private fun totalPerdedores(): Int {
        var cantidad=0
        for (est in lista){
            if (est.resultado.equals("Perdio")){
                cantidad=cantidad+1
            }
        }

        return cantidad
    }

    private fun totalGanadores(): Int {
        var cantidad=0
        for (est in lista){
            if (est.resultado.equals("Gano")){
                cantidad=cantidad+1
            }
        }

        return cantidad
    }

    private fun onClick() {
        var intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}