package com.example.onlineshopap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {
    private  lateinit var auth:FirebaseAuth




    lateinit var EnterUserName: EditText
    lateinit var EnterEmail: EditText
    lateinit var EnterPassword: EditText
    lateinit var confirmpass: EditText
    lateinit var login: Button
    lateinit var design: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()


        auth=FirebaseAuth.getInstance()

        EnterUserName=findViewById(R.id.mEditUser)
        EnterEmail=findViewById(R.id.mEditEmail)
        EnterPassword=findViewById(R.id.mEditPassword)
        confirmpass=findViewById(R.id.mEditConfirmPass)
        design=findViewById(R.id.mTvAccount)



        design.setOnClickListener{
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        login=findViewById(R.id.mBtnLogIn)
        login.setOnClickListener{
            SignupUser()
            val intent= Intent(this,HomePage::class.java)
            startActivity(intent)
            Toast.makeText(this@Register,"Registration successful", Toast.LENGTH_LONG).show()
        }
    }

    private fun SignupUser() {
        val email=EnterEmail.text.toString()
        val pass=EnterPassword.text.toString()
        val confrimpass=confirmpass.text.toString()

        if (email.isBlank()||pass.isBlank()||confrimpass.isBlank()){
            Toast.makeText(this,"fill these fields",Toast.LENGTH_LONG).show()
        }
        if(pass!= confrimpass){
            Toast.makeText(this,"Confirm Password to Proceed",Toast.LENGTH_LONG).show()
            return
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                val intent= Intent(this,HomePage::class.java)
                startActivity(intent)
                Toast.makeText(this,"user registered successful",Toast.LENGTH_LONG).show()
                finish()
            }else{
                Toast.makeText(this,"Registration Failed",Toast.LENGTH_LONG).show()
            }


        }

    }
}
