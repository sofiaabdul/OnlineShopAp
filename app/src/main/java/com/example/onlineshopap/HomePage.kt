package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class HomePage : AppCompatActivity() {
    lateinit var view: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

       view =findViewById(R.id.mBtnView)

       view =findViewById(R.id.mBtnView)
        view.setOnClickListener{
            val intent= Intent(this,Dashboard::class.java)
            startActivity(intent)
            Toast.makeText(this@HomePage,"View Products", Toast.LENGTH_LONG).show()
        }
    }
}