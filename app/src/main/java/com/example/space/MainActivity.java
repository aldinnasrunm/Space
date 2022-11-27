package com.example.space;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.space.databinding.ActivityMainBinding;
import com.example.space.screen.HomeScreenActivity;
import com.example.space.screen.LoginActivity;
import com.example.space.screen.LoginGoogle;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding bd;

    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bd = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bd.getRoot());
        auth = FirebaseAuth.getInstance();

        Intent i;
        //check if user is logged in
        Log.d("TAG", "Current User " + auth.getCurrentUser());
        if(auth.getCurrentUser() == null){
            i = new Intent(MainActivity.this, LoginGoogle.class);
        }else{
            i = new Intent(MainActivity.this, HomeScreenActivity.class);
        }
        startActivity(i);

    }
}