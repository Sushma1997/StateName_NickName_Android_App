package com.bitdev.MAD_Ind05_TambiReddy_SushmaReddy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView



class initialize : AppCompatActivity() {

    // Initialize all the variables
    private lateinit var stateName: TextView
    private lateinit var distance1: TextView
    private lateinit var StateFlag: ImageView
    private lateinit var StateMap: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secondpage)

        // we will fetch all the items
        StateFlag = this.findViewById(R.id.stateflag)
        StateMap = this.findViewById(R.id.statemap)
        distance1 = findViewById(R.id.distance)

        // we will extract states information from mainactivity
        val bundle = intent.extras
        val name = intent.getStringExtra("name")


        // we will get the stateName and will show it in the view
        stateName = findViewById(R.id.name)
        stateName.text = name

        //we will fetch stateflag, statemap and distance information
        val flagPicture = bundle?.getInt("flag")
        val mapPicture = bundle?.getInt("map")
        val areaSq = bundle?.getString("area")

        //we have null value just in case no values are inputed
        if (flagPicture != null) {

            //we will make it display in the outputscreen
            StateFlag.setImageResource(flagPicture)
        }
        if (mapPicture != null) {
            StateMap.setImageResource(mapPicture)
        }
        distance1.text = "$areaSq Sq. Miles"


    }
}