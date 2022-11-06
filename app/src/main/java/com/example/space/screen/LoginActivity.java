package com.example.space.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.space.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bd = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(bd.getRoot());
        //login activity here


    }
}