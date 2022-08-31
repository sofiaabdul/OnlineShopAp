package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var EnterEmail:EditText
    lateinit var EnterPass:EditText
    lateinit var Login:Button
    lateinit var account:TextView

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        EnterEmail=findViewById(R.id.mEditUser)
        EnterPass=findViewById(R.id.mEditPassword)
        Login=findViewById(R.id.mBtnLogIn)
        account=findViewById(R.id.mTvAccount)

        firebaseAuth= FirebaseAuth.getInstance()

        account.setOnClickListener{
            val intent=Intent(this,Register::class.java)
            startActivity(intent)
        }
        Login=findViewById(R.id.mBtnLogIn)
        Login.setOnClickListener{
            login()
        }
    }

    private fun login() {
        val email=EnterEmail.text.toString()
        val password=EnterPass.text.toString()

        if (email.isEmpty() || password.isEmpty()){
            Toast.makeText(applicationContext,"Fill all inputs",Toast.LENGTH_LONG).show()
        }else{
            firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this){
                if (it.isSuccessful){
                    val intent=Intent(this,HomePage::class.java)
                    startActivity(intent)
                    Toast.makeText(this,"Login successful",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"Log in Failed",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}