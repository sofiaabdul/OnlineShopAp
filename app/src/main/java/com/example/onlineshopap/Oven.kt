package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class Oven : AppCompatActivity() {

    lateinit var PaynowSix: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oven)
        supportActionBar?.hide()

        PaynowSix =findViewById(R.id.mBtnBuyNow)

        PaynowSix =findViewById(R.id.mBtnBuyNow)
        PaynowSix.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@Oven,"Success", Toast.LENGTH_LONG).show()
        }

    }
}