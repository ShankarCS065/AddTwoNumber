package com.krashkrosh748199.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val etFirst=findViewById<EditText>(R.id.etFirstNumber)
        val etSecond=findViewById<EditText>(R.id.etSecondNumber)
        val tvSeen=findViewById<TextView>(R.id.tvResult)
        val btnAdd=findViewById<Button>(R.id.btnAddition)
        btnAdd.setOnClickListener{
            val fst=etFirst.text.toString().toInt()
            val scd=etSecond.text.toString().toInt()
            val result=fst+scd
            tvSeen.text=result.toString()

        }

    }
}