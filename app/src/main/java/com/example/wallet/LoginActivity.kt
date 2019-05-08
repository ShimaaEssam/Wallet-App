package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.example.wallet.API.DataAPI
import com.example.wallet.model.ResponseMessage
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_login.*
import okhttp3.internal.Util
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginActivity : AppCompatActivity() {

    private lateinit var signupTV: TextView
    private lateinit var loginBtn: Button
    private lateinit var phoneNumber:TextView
    private lateinit var password: TextInputEditText
    private lateinit var progressBar: ProgressBar
    private var retrofit = Retrofit.Builder().baseUrl("http://www.amdkz.com")
        .addConverterFactory(GsonConverterFactory.create()).build()
    private var api = retrofit.create<DataAPI>(DataAPI::class.java)


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    signupTV=loginSignup
    loginBtn=login_Btn
    phoneNumber=loginNumber
    password= loginPassword as TextInputEditText
    progressBar=progressBarlogin


    signupTV.setOnClickListener {
        startActivity(Intent(this@LoginActivity, SignUpActivity::class.java))
        finish()
    }
    loginBtn.setOnClickListener OnClickListener@{

        var phone:String=phoneNumber.text.toString()
        var pass:String=password.text.toString()
        progressBar.visibility = View.VISIBLE
        val checker =  phone.isEmpty()|| pass.isEmpty()
        if (checker) {
            progressBar.visibility = View.GONE
            if( phone.isEmpty()) {
                phoneNumber.error = "Empty Email"
                Log.i("HH","HH")

            }
            else if(pass.isEmpty()) {
                password.error = "Empty Password"
                Log.i("HH","HH")

            }
            progressBar.visibility = View.VISIBLE

            return@OnClickListener

        }
        if (!TextUtils.isEmpty(phone) && !TextUtils.isEmpty(pass) )
        {        progressBar.visibility = View.VISIBLE

            sendLoginData(phone, pass)
            Log.i("HH","HH")


        }
//        startActivity(Intent(this@LoginActivity, HomeActivity::class.java))
//        finish()

    }

}
fun sendLoginData( phone: String, password: String) {
    Log.i("HII", "In")
    Toast.makeText(this@LoginActivity, "In", Toast.LENGTH_LONG).show()

    val connection = api.LoginUser(phone,password)
    Log.i("TAG", " $phone $password")

    connection.enqueue(object : Callback<ResponseMessage> {
        override fun onResponse(call: Call<ResponseMessage>, response: Response<ResponseMessage>) {
            Log.i("TAG", "API submitted")

            if (response.body()!!.Success == true) {
                Log.i("TAG", " true login")
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                Toast.makeText(this@LoginActivity, "Welcome to Home", Toast.LENGTH_LONG).show()
                startActivity(intent)

                finish()
            } else if (response.body()!!.Success == false) {
                Log.i("TAG", "false Login ")
                Toast.makeText(this@LoginActivity, response.body()!!.message, Toast.LENGTH_LONG).show()

            }
        }

        override fun onFailure(call: Call<ResponseMessage>, t: Throwable) {
            Log.i("TAG", "API not submitted")
        }
    })
}

override fun onPause() {
        super.onPause()
        phoneNumber.error=null
        password.error=null
    }
}
