package com.example.countrylist.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.countrylist.country_adapter.CountryAdapter
import com.example.countrylist.data.CountryInformData
import com.example.countrylist.R


class CountryActivity : AppCompatActivity() {

  private  val list= CountryInformData()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country)

        val recyclerView: RecyclerView = findViewById(R.id.rec)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CountryAdapter(list.data,this)
    }


}