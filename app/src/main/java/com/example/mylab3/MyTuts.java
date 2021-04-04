package com.example.mylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyTuts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_tuts);
    }

    public void tuts(View view) {
        Intent i = new Intent(this, Tutorials.class);
        startActivity(i);
        finish();
    }

    public void aboutus(View view) {
        Intent i = new Intent(this, Aboutus.class);
        startActivity(i);
        finish();
    }

    public void contactus(View view) {
        Intent i = new Intent(this, ContactDetails.class);
        startActivity(i);
        finish();
    }

    public void rateus(View view) {
        Intent i = new Intent(this, RateUs.class);
        startActivity(i);
        finish();
    }
}