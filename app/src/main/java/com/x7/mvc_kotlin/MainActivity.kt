package com.x7.mvc_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.MediaController

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
   lateinit var mainController: MainController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button1)

     mainController=MainController(this@MainActivity)


        button.setOnClickListener {
          mainController.changebuttontext()
        }


    }

    fun updateui(name:String){
     button.text=name
    }
}