package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast



class Fridge : AppCompatActivity() {
    lateinit var PaynowTwo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fridge)
        supportActionBar?.hide()

        PaynowTwo =findViewById(R.id.mBtnBuyNow)

        PaynowTwo =findViewById(R.id.mBtnBuyNow)
        PaynowTwo.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@Fridge,"Success", Toast.LENGTH_LONG).show()
        }

    }
}