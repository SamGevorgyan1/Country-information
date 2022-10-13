package com.example.countrylist.country_adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.countrylist.R
import com.example.countrylist.activity.CountryActivity

import com.example.countrylist.data.CountryEnum

class CountryAdapter( val context: Context) :
    RecyclerView.Adapter<CountryAdapter.MyViewHolder>() {

    private val items=CountryEnum.values()
    private val countryActivity=CountryActivity()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.recycleview, parent, false)
        return MyViewHolder(item)
    }

    override fun getItemCount(): Int = items.count()

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) = holder.bind(items[position])


    inner class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {
     private   var countryName = item.findViewById<TextView>(R.id.countryName)
     private   var countryCapital = item.findViewById<TextView>(R.id.countryCapital)
     private   val countryImage = item.findViewById<ImageView>(R.id.image_country)
     private   var countryIndependenceDate = item.findViewById<TextView>(R.id.CountryIndependenceDay)

        init {
            countryImage.setOnClickListener {countryActivity.showFlagDialog(items[absoluteAdapterPosition], context) }
            countryName.setOnClickListener{countryActivity.showInformCountry(items[absoluteAdapterPosition], context)}
            countryCapital.setOnClickListener{countryActivity.showInformCountry(items[absoluteAdapterPosition], context)}
            countryIndependenceDate.setOnClickListener{countryActivity.showInformCountry(items[absoluteAdapterPosition], context)}
        }

        fun bind(item:CountryEnum){
         Glide.with(context)
        .load(item.url)
        .into(countryImage)
            countryName.text=item.countryName
            countryCapital.text=item.capital
            countryIndependenceDate.text=item.independenceDay
        }
    }
}








