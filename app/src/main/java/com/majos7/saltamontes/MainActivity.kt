package com.majos7.saltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var listEstudiantes= mutableListOf<Estudiante>()

    var txtDocumento:EditText?=null
    var txtNombre:EditText?=null
    var txtEdad:EditText?=null
    var txtTelefono:EditText?=null
    var txtDireccion:EditText?=null

    var txtNombreMateria1:EditText?=null
    var txtNotaMateria1:EditText?=null
    var txtNombreMateria2:EditText?=null
    var txtNotaMateria2:EditText?=null
    var txtNombreMateria3:EditText?=null
    var txtNotaMateria3:EditText?=null
    var txtNombreMateria4:EditText?=null
    var txtNotaMateria4:EditText?=null
    var txtNombreMateria5:EditText?=null
    var txtNotaMateria5:EditText?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtDocumento=findViewById(R.id.Documento)
        txtNombre=findViewById(R.id.Nombre)
        txtEdad=findViewById(R.id.Edad)
        txtTelefono=findViewById(R.id.Telefono)
        txtDireccion=findViewById(R.id.Direccion)

        txtNombreMateria1=findViewById(R.id.NombreMateria1)
        txtNotaMateria1=findViewById(R.id.NotaMateria1)
        txtNombreMateria2=findViewById(R.id.NombreMateria2)
        txtNotaMateria2=findViewById(R.id.NotaMateria2)
        txtNombreMateria3=findViewById(R.id.NombreMateria3)
        txtNotaMateria3=findViewById(R.id.NotaMateria3)
        txtNombreMateria4=findViewById(R.id.NombreMateria4)
        txtNotaMateria4=findViewById(R.id.NotaMateria4)
        txtNombreMateria5=findViewById(R.id.NombreMateria5)
        txtNotaMateria5=findViewById(R.id.NotaMateria5)

        var btnCalcular:Button=findViewById(R.id.BtnCalcular)
        btnCalcular.setOnClickListener{onClick()}


    }

    private fun onClick() {
        var miEstudiante:Estudiante= Estudiante()
        miEstudiante.documento=txtDocumento?.text.toString()
        miEstudiante.nombre=txtNombre?.text.toString()
        miEstudiante.edad=txtEdad?.text.toString().toInt()
        miEstudiante.telefono=txtTelefono?.text.toString()
        miEstudiante.direccion=txtDireccion?.text.toString()

        miEstudiante.nombreMateria1=txtNombreMateria1?.text.toString()
        miEstudiante.notaMateria1=txtNotaMateria1?.text.toString().toDouble()
        miEstudiante.nombreMateria2=txtNombreMateria2?.text.toString()
        miEstudiante.notaMateria2=txtNotaMateria2?.text.toString().toDouble()
        miEstudiante.nombreMateria3=txtNombreMateria3?.text.toString()
        miEstudiante.notaMateria3=txtNotaMateria3?.text.toString().toDouble()
        miEstudiante.nombreMateria4=txtNombreMateria4?.text.toString()
        miEstudiante.notaMateria4=txtNotaMateria4?.text.toString().toDouble()
        miEstudiante.nombreMateria5=txtNombreMateria5?.text.toString()
        miEstudiante.notaMateria5=txtNotaMateria5?.text.toString().toDouble()
        var promedio = miEstudiante.notaMateria1!! +miEstudiante.notaMateria2!!+miEstudiante.notaMateria3!!+miEstudiante.notaMateria4!!+miEstudiante.notaMateria5!!/5
        miEstudiante.promedioFinal=promedio
        var resultado:String?=null
        if (promedio>3.5){
            resultado="Gano"
        }else{
            resultado="Perdio"
        }
        miEstudiante.resultado=resultado

        listEstudiantes.add(miEstudiante)

        var intent = Intent(this,ResultsActivity::class.java)
        val bundle:Bundle= Bundle()
        bundle.putString("documento",miEstudiante.documento)
        bundle.putString("nombre",miEstudiante.nombre)
        bundle.putInt("edad", miEstudiante.edad!!)
        bundle.putString("telefono", miEstudiante.telefono)
        bundle.putString("direccion", miEstudiante.direccion)
        bundle.putString("nombreMateria1", miEstudiante.nombreMateria1)
        bundle.putDouble("notaMateria1", miEstudiante.notaMateria1!!)
        bundle.putString("nombreMateria2", miEstudiante.nombreMateria2)
        bundle.putDouble("notaMateria2", miEstudiante.notaMateria2!!)
        bundle.putString("nombreMateria3", miEstudiante.nombreMateria3)
        bundle.putDouble("notaMateria3", miEstudiante.notaMateria3!!)
        bundle.putString("nombreMateria4", miEstudiante.nombreMateria4)
        bundle.putDouble("notaMateria4", miEstudiante.notaMateria4!!)
        bundle.putString("nombreMateria5", miEstudiante.nombreMateria5)
        bundle.putDouble("notaMateria5", miEstudiante.notaMateria5!!)
        bundle.putDouble("promedio", miEstudiante.promedioFinal!!)
        bundle.putString("resultado", miEstudiante.resultado)

        var recuperacion: Boolean? = null
        if (promedio<=2.5){
            recuperacion=false
        }else if(promedio<=3.5){
            recuperacion=true
        }else{
            recuperacion=null
        }

        if (recuperacion != null) {
            bundle.putBoolean("recuperacion", recuperacion)
        }

        intent.putExtras(bundle)
        startActivity(intent)

    }


}