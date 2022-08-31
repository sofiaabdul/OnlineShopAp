package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SmartPhone : AppCompatActivity() {

    lateinit var Paynow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smart_phone)
        supportActionBar?.hide()

        Paynow =findViewById(R.id.mBtnBuyNow)


        Paynow =findViewById(R.id.mBtnBuyNow)
        Paynow.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@SmartPhone,"Success", Toast.LENGTH_LONG).show()
        }

    }
}