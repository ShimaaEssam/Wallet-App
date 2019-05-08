package com.example.wallet

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_signup_message.*

class SignupMessageActivity : AppCompatActivity() {
    private lateinit var userName: TextView
    private lateinit var location: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_message)
        userName=username
        location=map
        initUi()
        location.setOnClickListener {
            val uri =
                "https://www.google.com/maps/place/%D8%B4%D8%A7%D8%B1%D8%B9+%D9%83%D9%88%D8%A8%D8%B1%D9%8A+%D8%A7%D9%84%D8%AD%D9%88%D8%A7%D9%85%D8%AF%D9%8A%D8%A9%D8%8C+Madinet+Al+Hawamdeyah,+Al+Hawamdeyah,+Giza+Governorate%E2%80%AD/@29.8962675,31.2655317,18z/data=!4m5!3m4!1s0x1458362bced36d01:0x7cc428a0b2448b5!8m2!3d29.8971102!4d31.2691558"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent.setPackage("com.amdkz.smartwallet")
            startActivity(intent)
        }



    }
    private fun initUi() {
        if (intent.hasExtra("NAME")) {
            val name = intent.extras!!.getString("NAME")
            userName.text = name

        } else {
            Toast.makeText(this, "No Data Found", Toast.LENGTH_LONG).show()
        }

    }


}
