package com.ram.kotlin.samples.retrofit

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ListView
import com.ram.kotlin.samples.retrofit.data.RecyclerAdapter
import com.ram.kotlin.samples.retrofit.data.kotlin.PostData
import com.ram.kotlin.samples.retrofit.data.kotlin.toast
import com.ram.kotlin.samples.retrofit.data.model.CheckInracterImpl
import com.ram.kotlin.samples.retrofit.data.model.CheckIntracter
import io.reactivex.disposables.CompositeDisposable

class MainActivity : AppCompatActivity() {

    val compositeDisposable: CompositeDisposable = CompositeDisposable()
    val checkintract:CheckIntracter=CheckInracterImpl()
    private lateinit var list:ListView
    val liwst:ArrayList<PostData> = ArrayList()
    lateinit var arraylist:List<String>
    lateinit var postdata : PostData
    var a:String="Java"
    val array= arrayOf("Kotlin","Android",1,2,3,44)
    val s=1
    lateinit var  listViewId : ListView
    lateinit var feedRecycler: RecyclerView
    val linearLayoutManager:LinearLayoutManager= LinearLayoutManager(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (item in array) {
            println("array value " + item)
        }
           feedRecycler=findViewById(R.id.list_view_id)  as RecyclerView
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        feedRecycler.setLayoutManager(linearLayoutManager);
        feedRecycler.setHasFixedSize(true);
       // listViewId=findViewById(R.id.list_view_id)as ListView
        feedRecycler.adapter=RecyclerAdapter()



       /* listViewId.setOnItemClickListener { parent, view, position, id ->
            // myFun(this)
            when(position)
            {
                1-> Toast.makeText(this,"Position :"+":"+position,Toast.LENGTH_SHORT).show()
                2-> Toast.makeText(this,"Position :"+":"+position,Toast.LENGTH_SHORT).show()
                3-> Toast.makeText(this,"Position :"+":"+position,Toast.LENGTH_SHORT).show()
                4-> Toast.makeText(this,"Position :"+":"+position,Toast.LENGTH_SHORT).show()
                else->
                {
                    Toast.makeText(this,"Conditions didn't match!",Toast.LENGTH_SHORT).show()
                }

            }
           *//* this.toast("Clicked on List position!")
            Toast.makeText(this,"Position :"+":"+position,Toast.LENGTH_SHORT).show()*//*
        }*/



        //checkintract.serviceCalling("Andy1111|1505466329|n2k1TegC3gcBGqj4MrnJnu7UXObVwhxYbSY8eM2yblT|2b533c4f628dfe762a7d72e9ebabad8f059465d66ca2aa76ce743637b093e423","2065")


    }

    fun myFun(context: Context) {
        context.toast("Clicked on List position!")
    }


    override fun onDestroy() {
        compositeDisposable.clear()
        super.onDestroy()
    }
}

