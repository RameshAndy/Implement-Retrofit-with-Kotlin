package com.ram.kotlin.samples.retrofit.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.ram.kotlin.samples.retrofit.R

/**
 * Created by ramesh on 15/9/17.
 */
class AdapterClass(val context:Context) : BaseAdapter() {
    var mContext:Context
    init {
        this.mContext=context
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View
        if (convertView==null)
        {
            view=LayoutInflater.from(mContext).inflate(R.layout.adaper_layout,parent,false)
        }
        else
        {
            view=convertView;
        }
        return view
    }

    override fun getItem(position: Int): Any {
       return position
    }

    override fun getItemId(position: Int): Long {
         return position.toLong()
    }

    override fun getCount(): Int {
        return 15
    }
}