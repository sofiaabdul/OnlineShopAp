package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class FlatScreen : AppCompatActivity() {
    lateinit var PaynowOne: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flat_screen)
        supportActionBar?.hide()

        PaynowOne =findViewById(R.id.mBtnBuyNow)

        PaynowOne =findViewById(R.id.mBtnBuyNow)
        PaynowOne.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@FlatScreen,"Success", Toast.LENGTH_LONG).show()
        }

    }
}