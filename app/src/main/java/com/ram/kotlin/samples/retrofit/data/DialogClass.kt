package com.ram.kotlin.samples.retrofit.data

import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.Toast

import com.ram.kotlin.samples.retrofit.R

/**
 * Created by ramesh on 16/9/17.
 */

class DialogClass {

    companion object {
        fun DialogMethod(context: Context) {
            val dialog = Dialog(context)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setContentView(R.layout.activity_main)
            dialog.show()


        }
    }

    fun add(context: Context)
    {
   Toast.makeText(context,"",Toast.LENGTH_SHORT).show()
    }

}
