package com.example.wallet.model

class Report {
    var phoneNumber:String
    var price:String
    var status:String
    var date:String
    var time:String

    constructor(phoneNumber: String, price: String, status: String, date: String, time: String) {
        this.phoneNumber = phoneNumber
        this.price = price
        this.status = status
        this.date = date
        this.time = time
    }
}