package com.example.lotesperuanosapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lotesperuanosapp.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWelcome.setOnClickListener{screenHome()}

    }

    fun screenHome(){
        if(btnWelcome.text.isNotEmpty()){
            val ss:String = intent.getStringExtra("Peloy").toString()
            startActivity(intent)
        }else{ showErrorName()
        }
    }
    fun showErrorName(){
        Toast.makeText(this, "Ingresar Usuario", Toast.LENGTH_SHORT).show()
    }


}