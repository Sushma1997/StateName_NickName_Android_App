package com.bitdev.MAD_Ind05_TambiReddy_SushmaReddy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // fetching into of MyAdapter by using its id
        val initializer = findViewById<RecyclerView>(R.id.statestable)

        //an arraylist
        val data = ArrayList<State>()

        // we are adding the details into arraylist
        data.add(State("Alabama", "Yellowhammer State", R.drawable.alabamamap, R.drawable.alabamaflag, "52,419"))
        data.add(State("Alaska", "The Last Frontier", R.drawable.alaskamap,R.drawable.alaskaflag,"665,400"))
        data.add(State("Arizona", "The Grand Canyon State", R.drawable.arizonamap, R.drawable.arizonaflag, "113,998"))
        data.add(State("Arkansas", "The Natural State", R.drawable.arkansasmap, R.drawable.arkansasflag, "53,179"))
        data.add(State("California", "The Golden State", R.drawable.californiamap, R.drawable.californiaflag, "163,696"))
        data.add(State("Colorado", "The Centennial State", R.drawable.coloradomap, R.drawable.coloradoflag, "104,185"))
        data.add(State("Connecticut", "The Constitution State", R.drawable.connecticutmap, R.drawable.connecticutflag, "5,543"))
        data.add(State("Delaware", "The First State", R.drawable.delawaremap, R.drawable.delawareflag, "1,982"))
        data.add(State("Florida", "The Sunshine State", R.drawable.floridamap, R.drawable.floridaflag, "65,758"))
        data.add(State("Georgia", "The Peach State", R.drawable.georgia_map, R.drawable.georgia_flag, "59,425"))
        data.add(State("Hawaii", "The Aloha State", R.drawable.hawai_map, R.drawable.hawai_flag, "10,931"))
        data.add(State("Idaho", "The Gem State", R.drawable.idaho_map, R.drawable.idaho_flag, "83,642"))
        data.add(State("Illinois", "Prairie State", R.drawable.illinois_map, R.drawable.illinois_flag, "57,915"))
        data.add(State("Indiana", "The Hoosier State", R.drawable.indiana_map, R.drawable.indiana_flag, "36,418"))
        data.add(State("Iowa", "The Hawkeye State", R.drawable.iowa_map, R.drawable.iowa_flag, "55,857"))
        data.add(State("Kansas", "The Sunflower State", R.drawable.kansas_map, R.drawable.kansas_flag, "82,278"))
        data.add(State("Kentucky", "The Bluegrass State", R.drawable.kentucky_map, R.drawable.kentucky_flag, "40,409"))
        data.add(State("Louisiana", "The Pelican State", R.drawable.louisiana_map, R.drawable.louisiana_flag, "52,378"))
        data.add(State("Maine", "The Pine Tree State", R.drawable.illinois_map, R.drawable.illinois_flag, "35,385"))
        data.add(State("Maryland", "The Old Line State", R.drawable.maryland_map, R.drawable.maryland_flag, "12,407"))
        data.add(State("Massachusetts", "The Bay State", R.drawable.massachusetts_map, R.drawable.massachusetts_flag, "10,565"))
        data.add(State("Michigan", "The Great Lakes State", R.drawable.michigan_map, R.drawable.michigan_flag, "96,716"))
        data.add(State("Minnesota", "The North Star State", R.drawable.minnesota_map, R.drawable.minnesota_flag, "86,943"))
        data.add(State("Mississippi", "The Magnolia State", R.drawable.mississippi_map, R.drawable.mississippi_flag, "48,430"))
        data.add(State("Missouri", "The Show Me State", R.drawable.missouri_map, R.drawable.missouri_flag, "69,715"))
        data.add(State("Montana", "The Treasure State", R.drawable.montana_map, R.drawable.montana_flag, "147,040"))
        data.add(State("Nebraska", "The Cornhusker State", R.drawable.nebraska_map, R.drawable.nebraska_flag, "77,358"))
        data.add(State("Nevada", "The Silver State", R.drawable.nevada_map, R.drawable.nevada_flag, "110,567"))
        data.add(State("New Hampshire", "The Granite State", R.drawable.new_hampshire_map, R.drawable.new_hampshire_flag, "9,349"))
        data.add(State("New Jersey", "The Garden State", R.drawable.new_jersey_map, R.drawable.new_jersey_flag, "8,723"))
        data.add(State("New Mexico", "The Land of Enchantment", R.drawable.new_mexico_map, R.drawable.new_mexic_flag, "121,697"))
        data.add(State("New York", "The Empire State", R.drawable.new_york_map, R.drawable.new_york_flag, "302.6"))
        data.add(State("North Carolina", "The Tar Heel State", R.drawable.north_carolina_map, R.drawable.north_carolina_flag, "53,819"))
        data.add(State("North Dakota", "The Peace Garden State", R.drawable.north_dakota_map, R.drawable.north_dakota_flag, "70,704"))
        data.add(State("Ohio", "The Buckeye State", R.drawable.ohio_map, R.drawable.ohio_flag, "44,825"))
        data.add(State("Oklahoma", "The Sooner State", R.drawable.oklahoma_map, R.drawable.oklahoma_flag, "69,899"))
        data.add(State("Oregon", "The Beaver State", R.drawable.oregon_map, R.drawable.oregon_flag, "98,466"))
        data.add(State("Pennsylvania", "The Keystone State", R.drawable.pennsylvania_map, R.drawable.pennsylvania_flag, "46,055"))
        data.add(State("Rhode Island", "The Ocean State", R.drawable.rhode_island_map, R.drawable.rhode_island_flag, "1,214"))
        data.add(State("South Carolina", "The Palmetto State", R.drawable.south_carolina_map, R.drawable.south_carolina_flag, "32,020"))
        data.add(State("South Dakota", "Mount Rushmore State", R.drawable.south_dakota_map, R.drawable.south_dakota_flag, "77,116"))
        data.add(State("Tennessee", "The Volunteer State", R.drawable.tennessee_map, R.drawable.tennessee_flag, "42,181"))
        data.add(State("Texas", "The Lone Star State", R.drawable.texas_map, R.drawable.texas_flag, "268,597"))
        data.add(State("Utah", "The Beehive State", R.drawable.utah_map, R.drawable.utah_flag, "84,899"))
        data.add(State("Vermont", "The Green Mountain State", R.drawable.vermont_map, R.drawable.vermont_flag, "9,616"))
        data.add(State("Virginia", "The Old Dominion State", R.drawable.virginia_map, R.drawable.virginia_flag, "42,775"))
        data.add(State("Washington", "The Evergreen State",R.drawable.washington_map, R.drawable.washington_flag, "71,300"))
        data.add(State("West Virginia", "The Mountain State", R.drawable.west_virginia_map, R.drawable.west_virginia_flag, "24,038"))
        data.add(State("Wisconsin", "The Badger State", R.drawable.wisconsin_map, R.drawable.wisconsin_flag, "65,498"))
        data.add(State("Wyoming", "The Equality or Cowboy State", R.drawable.wyoming_map, R.drawable.wyoming_flag, "97,914"))


        // we will create a layout for display
        initializer.layoutManager = LinearLayoutManager(this)

        // we are transferring arraylist to MyAdapter
        val adapter = MyAdapter(data, this)
        initializer.adapter = adapter

    }
}