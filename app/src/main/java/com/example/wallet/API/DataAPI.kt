package com.example.wallet.API

import com.example.wallet.model.RequestService
import com.example.wallet.model.ResponseMessage
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.GET
import retrofit2.Call


interface DataAPI {
//    @FormUrlEncoded
//    @POST("/user/customer/register")
//    abstract fun addUser(
//        @Field("name") name: String,
//        @Field("email") email: String,
//        @Field("phoneNumber") phoneNumber: String,
//        @Field("password") password: String,
//        @Field("username") username: String
//    ): Call<ResponseMessage>
//
//    @FormUrlEncoded
//    @POST("/user/customer/forget-pass-code")
//    abstract fun addPhoneNumber(@Field("phoneNumber") phoneNumber: String): Call<ResponseMessage>
//
//    @FormUrlEncoded
//    @POST("/user/customer/verify-forget-pass-code")
//    abstract fun verifyCode(@
// Field("passVerificationCode") passVerificationCode: String): Call<ResponseMessage>

    @FormUrlEncoded
    @POST("/loginAPI")
    abstract fun LoginUser(
        @Field("phone") phone: String,
        @Field("password") password: String
    ): Call<ResponseMessage>
//@GET("/loginAPI/0123456+/0123456")
//abstract fun LoginUser(): Call<ResponseMessage>
//    @FormUrlEncoded
//    @POST("/user/customer/update-account")
//    abstract fun updateAccount(
//        @Field("password") password: String,
//        @Header("Authorization") token: String
//    ): Call<ResponseMessage>
//
//    @GET("/services/list-all")
//    abstract fun getService(): Call<RequestService>
}