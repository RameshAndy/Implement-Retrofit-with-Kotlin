package com.ram.kotlin.samples.retrofit.data.kotlin

import android.content.Context
import android.widget.Toast

/**
 * Created by ramesh on 15/9/17.
 */
fun Context.toast(message: CharSequence) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()