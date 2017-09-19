package com.ram.kotlin.samples.retrofit.data

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ram.kotlin.samples.retrofit.R

/**
 * Created by ramesh on 15/9/17.
 */
class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

     lateinit var view :View
    override fun getItemCount(): Int {
        return 15
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        view=LayoutInflater.from(parent.context).inflate(R.layout.adaper_layout,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    }

    class MyViewHolder(view :View) : RecyclerView.ViewHolder(view)
    {

    }
}