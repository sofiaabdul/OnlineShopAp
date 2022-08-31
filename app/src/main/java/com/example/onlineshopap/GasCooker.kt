package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class GasCooker : AppCompatActivity() {

    lateinit var PaynowThree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gas_cooker)
        supportActionBar?.hide()

        PaynowThree =findViewById(R.id.mBtnBuyNow)

        PaynowThree =findViewById(R.id.mBtnBuyNow)
        PaynowThree.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@GasCooker,"Success", Toast.LENGTH_LONG).show()
        }

    }
}