package com.example.countrylist

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CountryAdapter(private val data: List<CountryData>, val context: Context) :
    RecyclerView.Adapter<CountryAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.recycleview, parent, false)
        return MyViewHolder(item)
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) = holder.bind(data[position])


    inner class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {
     private   var countryName = item.findViewById<TextView>(R.id.countryName)
     private   var countryCapital = item.findViewById<TextView>(R.id.countryCapital)
     private   val countryImage = item.findViewById<ImageView>(R.id.image_country)
     private   var countryIndependenceDate = item.findViewById<TextView>(R.id.CountryIndependenceDay)

        init {
            countryImage.setOnClickListener { showFlagDialog() }
            countryName.setOnClickListener{showInformCountry()}
            countryCapital.setOnClickListener{showInformCountry()}
            countryIndependenceDate.setOnClickListener{showInformCountry()}
        }

      private  fun showFlagDialog() {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.dialog_flag)
            val img = dialog.findViewById<ImageView>(R.id.img_dialog)

            Glide.with(context)
                .load(data[absoluteAdapterPosition].url)
                .into(img)

            dialog.show()
        }

      private  fun showInformCountry() {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.dialog_inform)
          val countryInform=dialog.findViewById<TextView>(R.id.countryInform)
          val country_name=dialog.findViewById<TextView>(R.id.country_Name)
          val country_capital=dialog.findViewById<TextView>(R.id.country_Capital)
          val country_IndependenceDay=dialog.findViewById<TextView>(R.id.country_IndependenceDay)
          val countryImage=dialog.findViewById<ImageView>(R.id.country_image)

          country_name.text=data[absoluteAdapterPosition].countryName
          country_capital.text=data[absoluteAdapterPosition].countryCapital
          country_IndependenceDay.text=data[absoluteAdapterPosition].countryIndependenceDay
          countryInform.text=data[absoluteAdapterPosition].countryInform

          Glide.with(context)
              .load(data[absoluteAdapterPosition].url)
              .into(countryImage)

            dialog.show()

        }


        fun bind(item: CountryData) {
            Glide.with(context)
                .load(item.url)
                .into(countryImage)

            countryName.text = item.countryName
            countryCapital.text = item.countryCapital
            countryIndependenceDate.text = item.countryIndependenceDay
        }
    }
}








