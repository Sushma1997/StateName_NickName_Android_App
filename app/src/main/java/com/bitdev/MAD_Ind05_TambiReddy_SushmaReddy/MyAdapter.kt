package com.bitdev.MAD_Ind05_TambiReddy_SushmaReddy

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class MyAdapter(val myList: List<State>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // we are Initializing a single line
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.firstpage, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val state = myList[position]

        holder.nickname.text = state.nickname
        holder.statename.text = state.statename

        holder.itemView.setOnClickListener {
            val intent = Intent(context, initialize::class.java)
            intent.putExtra("name", holder.statename.text)
            intent.putExtra("flag", state.stateflag)
            intent.putExtra("map", state.statemap)
            intent.putExtra("area", state.distance)
            context.startActivity(intent)
        }
    }

    // we are Returning the number of items in the list
    override fun getItemCount(): Int {
        return myList.size
    }

    // viewholder to add images to the view
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val statename: TextView = itemView.findViewById(R.id.statename)
        val nickname: TextView = itemView.findViewById(R.id.nickname)
    }
}