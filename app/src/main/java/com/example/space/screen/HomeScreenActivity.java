package com.example.space.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.space.databinding.ActivityHomeScreenBinding;

public class HomeScreenActivity extends AppCompatActivity {

    private ActivityHomeScreenBinding bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bd = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(bd.getRoot());
        //homescreen
    }
}