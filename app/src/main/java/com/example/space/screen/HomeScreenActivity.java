package com.example.space.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.space.databinding.ActivityHomeScreenBinding;
import com.google.firebase.auth.FirebaseAuth;

public class HomeScreenActivity extends AppCompatActivity {

    private ActivityHomeScreenBinding bd;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bd = ActivityHomeScreenBinding.inflate(getLayoutInflater());
        setContentView(bd.getRoot());
        getSupportActionBar().hide();
        //homescreen

        auth = FirebaseAuth.getInstance();
        Log.d("TAG", "onCreate: " + auth.getCurrentUser().getDisplayName());
//        bd.tvUser.setText(auth.getCurrentUser().getDisplayName());



    }
}