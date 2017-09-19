package com.ram.kotlin.samples.retrofit.data.model

import android.util.Log
import com.ram.kotlin.samples.retrofit.data.RetrofitClass
import com.ram.kotlin.samples.retrofit.data.kotlin.GithubApiService
import com.ram.kotlin.samples.retrofit.data.kotlin.PostData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by ramesh on 14/9/17.
 */
class CheckInracterImpl : CheckIntracter {
    lateinit var call: Call<PostData>
    override fun serviceCalling(token: String, id: String) {
        val github_service:GithubApiService=RetrofitClass().retrofit.create(GithubApiService::class.java)
        call = github_service.search(token,id)
        call.enqueue(object : Callback<PostData> {
            override fun onResponse(call: Call<PostData>?, response: Response<PostData>?) {

                if (response != null && response.isSuccessful) {

                     Log.d("Result", "There are ${response.body()} Java developers in Lagos")

                    // pokemonListListener.onSuccess(response.body())
                } else {
                    // pokemonListListener.onFailure(appContext.getString(R.string.error_fetching_data))
                }


            }

            override fun onFailure(call: Call<PostData>?, t: Throwable?) {
                if (t != null) {
                    Log.d("Result", "There are ${t.message} Java developers in Lagos")
                }

                // pokemonListListener.onFailure(appContext.getString(R.string.error_fetching_data))
            }
        })


    }


}
