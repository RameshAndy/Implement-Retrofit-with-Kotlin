package com.ram.kotlin.samples.retrofit.data;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ram.kotlin.samples.retrofit.R;

/**
 * Created by ramesh on 16/9/17.
 */

public class ImplementActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         DialogClass dialogClass=new DialogClass();
        dialogClass.add(this);
        DialogClass.Companion.DialogMethod(this);


    }
}
