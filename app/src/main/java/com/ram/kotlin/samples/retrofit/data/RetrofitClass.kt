package com.ram.kotlin.samples.retrofit.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by ramesh on 14/9/17.
 */
 class RetrofitClass {

        val retrofit:Retrofit = retrofit2.Retrofit.Builder().baseUrl("http://10.5.6.103/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

}