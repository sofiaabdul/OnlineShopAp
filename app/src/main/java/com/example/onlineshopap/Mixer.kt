package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast



class Mixer : AppCompatActivity() {

    lateinit var PaynowFive: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mixer)
        supportActionBar?.hide()

        PaynowFive =findViewById(R.id.mBtnBuyNow)

        PaynowFive=findViewById(R.id.mBtnBuyNow)
        PaynowFive.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@Mixer,"Success", Toast.LENGTH_LONG).show()
        }

    }
}