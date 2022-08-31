package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Toast

class Dashboard : AppCompatActivity() {

    lateinit var ImageOne: ImageView
    lateinit var ImageTwo: ImageView
    lateinit var ImageThree: ImageView
    lateinit var ImageFour: ImageView
    lateinit var ImageFive: ImageView
    lateinit var ImageSix: ImageView
    lateinit var ImageSeven: ImageView
    lateinit var ImageEight: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        supportActionBar?.hide()

        ImageOne=findViewById(R.id.ImgOne)
        ImageTwo=findViewById(R.id.ImgTwo)
        ImageThree=findViewById(R.id.ImgThree)
        ImageFour=findViewById(R.id.ImgFour)
        ImageFive=findViewById(R.id.ImgFive)
        ImageSix=findViewById(R.id.ImgSix)
        ImageSeven=findViewById(R.id.ImgSeven)
        ImageEight=findViewById(R.id.ImgEight)


        ImageOne=findViewById(R.id.ImgOne)
        ImageOne.setOnClickListener{
            val intent= Intent(this,SmartPhone::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"SmartPhone", Toast.LENGTH_LONG).show()
        }


        ImageTwo=findViewById(R.id.ImgTwo)
        ImageTwo.setOnClickListener{
            val intent= Intent(this,FlatScreen::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"Flatscreen", Toast.LENGTH_LONG).show()
        }

        ImageThree=findViewById(R.id.ImgThree)
        ImageThree.setOnClickListener{
            val intent= Intent(this,Homethreatre::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"Homethreatre", Toast.LENGTH_LONG).show()
        }

        ImageFour=findViewById(R.id.ImgFour)
        ImageFour.setOnClickListener{
            val intent= Intent(this,Mixer::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"Mixer", Toast.LENGTH_LONG).show()
        }

        ImageFive=findViewById(R.id.ImgFive)
        ImageFive.setOnClickListener{
            val intent= Intent(this,Oven::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"Oven", Toast.LENGTH_LONG).show()
        }

        ImageSix=findViewById(R.id.ImgSix)
        ImageSix.setOnClickListener{
            val intent= Intent(this,PressureCooker::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"PressureCooker", Toast.LENGTH_LONG).show()
        }

        ImageSeven=findViewById(R.id.ImgSeven)
        ImageSeven.setOnClickListener{
            val intent= Intent(this,GasCooker::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"GasCooker", Toast.LENGTH_LONG).show()
        }

        ImageEight=findViewById(R.id.ImgEight)
        ImageEight.setOnClickListener{
            val intent= Intent(this,Fridge::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"Fridge", Toast.LENGTH_LONG).show()
        }


    }
}