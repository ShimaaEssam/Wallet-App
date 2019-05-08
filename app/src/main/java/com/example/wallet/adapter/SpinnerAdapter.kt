package com.example.wallet.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.wallet.R

class SpinnerAdapter(val context: Context, var listItemsTxt: Array<String>, var listItemsImg: Array<Int>) : BaseAdapter() {


    val mInflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val vh: ItemRowHolder
        if (convertView == null) {
            view = mInflater.inflate(R.layout.spinner_item, parent, false)
            vh = ItemRowHolder(view)
            view?.tag = vh
        } else {
            view = convertView
            vh = view.tag as ItemRowHolder
        }
        Glide.with(context).load(listItemsImg.get(position)).into(vh.icon)
        vh.label.text = listItemsTxt.get(position)
        return view
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {

        return 0

    }

    override fun getCount(): Int {
        return listItemsTxt.size
    }

    private class ItemRowHolder(row: View?) {

        val label: TextView
        val icon : ImageView

        init {
            this.label = row?.findViewById(R.id.textView) as TextView
            this.icon = row?.findViewById((R.id.imageView)) as ImageView
        }
    }
}
//class SpinnerAdapter : BaseAdapter(){
//
//    private lateinit var context:Context
//    private lateinit var inflater:LayoutInflater
//    private lateinit var images:List<String>
//    private lateinit var texts:List<String>
//
//    constructor(context: Context, images: List<String>, texts: List<String>) : super() {
//        this.context = context
//        this.images = images
//        this.texts = texts
//        inflater= LayoutInflater.from(context)
//    }
//
//    override fun getView(i: Int, view: View?, parent: ViewGroup?): View {
//        view = inflater.inflate(R.layout.spinner_item, null);
//        var icon:ImageView =  view.findViewById(R.id.imageView);
//        var names :TextView=  view.findViewById(R.id.textView);
//        icon.setImageResource(images[i]);
//        names.text = texts[i]
//        return view
//    }
//
//    override fun getItem(position: Int): Any? {
//        return null
//    }
//
//    override fun getItemId(position: Int): Long {
//        return 0
//    }
//
//    override fun getCount(): Int {
//        return images.size;    }
//
//}
