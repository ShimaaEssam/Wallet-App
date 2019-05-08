package com.example.wallet.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class User {
    @SerializedName("id")
    @Expose
    private var id: Int? = null
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("userName")
    @Expose
    private var userName: String? = null
    @SerializedName("email")
    @Expose
    private var email: String? = null
    @SerializedName("phone")
    @Expose
    private var phone: String? = null
    @SerializedName("NationalID")
    @Expose
    private var NationalID: Int? = null
    @SerializedName("address")
    @Expose
    private var address: String? = null
    @SerializedName("walet")
    @Expose
    private var walet: Int? = null


}
