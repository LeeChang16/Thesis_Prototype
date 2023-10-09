package com.example.prototypeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class intro extends AppCompatActivity {
Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signup);


    }
}