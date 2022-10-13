package com.example.countrylist.activity


import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.countrylist.country_adapter.CountryAdapter
import com.example.countrylist.R
import com.example.countrylist.data.CountryEnum


class CountryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)

        val recyclerView: RecyclerView = findViewById(R.id.rec)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CountryAdapter(this)
    }

    fun showFlagDialog(countryEnum: CountryEnum, context: Context) {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_flag)
        val img = dialog.findViewById<ImageView>(R.id.img_dialog)

        Glide.with(context)
            .load(countryEnum.url)
            .into(img)

        dialog.show()
    }


    fun showInformCountry(countryEnum: CountryEnum, context: Context) {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_inform)
        val countryInform = dialog.findViewById<TextView>(R.id.countryInform)
        val country_name = dialog.findViewById<TextView>(R.id.country_Name)
        val country_capital = dialog.findViewById<TextView>(R.id.country_Capital)
        val country_IndependenceDay = dialog.findViewById<TextView>(R.id.country_IndependenceDay)
        val countryImage = dialog.findViewById<ImageView>(R.id.country_image)

        country_name.text = countryEnum.countryName
        country_capital.text = countryEnum.capital
        country_IndependenceDay.text = countryEnum.independenceDay
        countryInform.text = countryEnum.countryInform

        Glide.with(context)
            .load(countryEnum.url)
            .into(countryImage)

        dialog.show()
    }

}


