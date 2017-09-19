package com.ram.kotlin.samples.retrofit.data.kotlin

import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.Query

interface GithubApiService {

    @retrofit2.http.GET("get_post")
    fun search(@Header("token")token:String,@Query("id") id: String ): Call<PostData>
               //@retrofit2.http.Query("page") page: Int = 1,
               //@retrofit2.http.Query("per_page") perPage: Int = 20): io.reactivex.Observable<Result>


    /**
     * Companion object for the factory
     */
    /*companion object Factory {
        fun create(): com.segunfamisa.kotlin.samples.retrofit.data.kotlin.GithubApiService {
            val retrofit = retrofit2.Retrofit.Builder()
                    .addCallAdapterFactory(retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.create())
                    .addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create())
                    .baseUrl("http://10.5.6.103/api/")
                    .build()

            return retrofit.create(com.segunfamisa.kotlin.samples.retrofit.data.kotlin.GithubApiService::class.java);
        }
    }*/
}