package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var loginTV: TextView
    private lateinit var signupBtn: Button
    private lateinit var nameET: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        loginTV=signupLogin
        signupBtn=signup_Btn
        nameET=signupName
        loginTV.setOnClickListener {
            startActivity(Intent(this@SignUpActivity, LoginActivity::class.java))
            finish()
        }
        signupBtn.setOnClickListener {
            var name:String=nameET.text.toString()
            if(!name.isEmpty()) {
                val intent = Intent(this, SignupMessageActivity::class.java)
                intent.putExtra("NAME", name)
                startActivity(intent)
                finish()
            }
            else{
                nameET.error = "الرجاء إدخال الأسم"
            }

        }

    }
}


