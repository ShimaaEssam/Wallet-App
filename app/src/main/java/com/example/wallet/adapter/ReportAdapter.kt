package com.example.wallet.adapter

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wallet.R
import com.example.wallet.model.Report

class ReportAdapter() : RecyclerView.Adapter<ReportAdapter.MyViewHolder>(), Parcelable {
    private lateinit var list: List<Report>
    private lateinit var context: Context

    constructor(parcel: Parcel) : this() {

    }

    constructor(list: List<Report>, context: Context) : this() {
        this.list = list
        this.context = context
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ReportAdapter.MyViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.report_item, viewGroup, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(myViewHolder: ReportAdapter.MyViewHolder, i: Int) {
        myViewHolder.bind(list[i])
    }

    class MyViewHolder : RecyclerView.ViewHolder {
        // var offerDesc: TextView
        lateinit var userNumber: TextView
        lateinit var userPrice: TextView
        lateinit var userStatus: TextView
        lateinit var date: TextView
        lateinit var time: TextView


        constructor(itemView: View) : super(itemView) {
            //   offerDesc=itemView.findViewById(R.id.menu_name)
            userNumber = itemView.findViewById(R.id.phoneNumber)
            userPrice = itemView.findViewById(R.id.count)
            userStatus = itemView.findViewById(R.id.status)
            date = itemView.findViewById(R.id.date)
            time = itemView.findViewById(R.id.time)

        }

        fun bind(report: Report) = with(itemView) {
            userNumber.text = report.phoneNumber
            userPrice.text = report.price
            userStatus.text = report.status
            date.text = report.date
            time.text = report.time


        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ReportAdapter> {
        override fun createFromParcel(parcel: Parcel): ReportAdapter {
            return ReportAdapter(parcel)
        }

        override fun newArray(size: Int): Array<ReportAdapter?> {
            return arrayOfNulls(size)
        }
    }
}
