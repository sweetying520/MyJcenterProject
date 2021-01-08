package com.dream.myjcenterproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.location.sweetying.SmartLocation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SmartLocation.location();
    }
}