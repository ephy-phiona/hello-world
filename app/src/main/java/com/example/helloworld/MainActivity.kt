package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
  lateinit var btnApp:Button
lateinit var btnsendMoney: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnApp=findViewById(R.id.btnApp)
        btnApp.setOnClickListener{
            val intent=Intent(this,calculateBMIactivity::class.java)
            startActivity(intent)
        }
        btnsendMoney = findViewById(R.id.btnSendMoney)
        btnsendMoney.setOnClickListener {
            val intent = Intent(this,sendMoney::class.java )
            startActivity(intent)
        }
    }
}
