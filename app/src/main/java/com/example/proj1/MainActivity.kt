package com.example.proj1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textView:TextView
    var name="Noel"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var button= findViewById<Button>(R.id.namebutton)

         textView = findViewById<TextView>(R.id.nametextview)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        textView.text = name
        Log.d("Noel","i have been clicked")
    }
}