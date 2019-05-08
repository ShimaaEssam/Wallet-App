package com.example.wallet.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseMessage {
    @SerializedName("Success")
    @Expose
     var Success: Boolean? = null
    @SerializedName("message")
    @Expose
     var message: String? = null
    @SerializedName("user")
    @Expose
     var user: List<User>? = null



}