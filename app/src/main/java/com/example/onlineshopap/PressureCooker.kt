package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class PressureCooker : AppCompatActivity() {
    lateinit var PaynowSeven: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pressure_cooker)
        supportActionBar?.hide()

        PaynowSeven =findViewById(R.id.mBtnBuyNow)

        PaynowSeven =findViewById(R.id.mBtnBuyNow)
        PaynowSeven.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@PressureCooker,"Success", Toast.LENGTH_LONG).show()
        }

    }
}