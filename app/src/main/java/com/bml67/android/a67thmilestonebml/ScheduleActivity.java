package com.bml67.android.a67thmilestonebml;

/**
 * Created by Student on 20/2/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class ScheduleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

    }

    public void March1(View view){
        Intent march1 = new Intent(this,March1.class);
        startActivity(march1);


    };

    public void march2(View view){
        Intent march1 = new Intent(this,March2.class);
        startActivity(march1);


    };

    public void march3(View view){
        Intent march1 = new Intent(this,March3.class);
        startActivity(march1);


    };

    public void march4(View view){
        Intent march1 = new Intent(this,March4.class);
        startActivity(march1);


    };



}
