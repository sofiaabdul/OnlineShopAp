package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class Homethreatre : AppCompatActivity() {

    lateinit var PaynowFour: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homethreatre)
        supportActionBar?.hide()

        PaynowFour =findViewById(R.id.mBtnBuyNow)

        PaynowFour =findViewById(R.id.mBtnBuyNow)
        PaynowFour.setOnClickListener{
            val intent= Intent(this,Payment::class.java)
            startActivity(intent)
            Toast.makeText(this@Homethreatre,"Success", Toast.LENGTH_LONG).show()
        }

    }
}