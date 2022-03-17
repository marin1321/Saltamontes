package com.majos7.saltamontes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val resultado = findViewById<TextView>(R.id.resultado)


        var bundle: Bundle? = this.intent.extras

        resultado.text="${bundle?.getString("resultado")}"

    }
}