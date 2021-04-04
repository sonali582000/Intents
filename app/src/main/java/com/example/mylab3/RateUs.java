package com.example.mylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class RateUs extends AppCompatActivity {
    RatingBar rb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);

        rb1=findViewById(R.id.rb1);

    }

    public void starts(View view) {
        String s=String.valueOf(rb1.getRating());
        Toast.makeText(this,s+"Star",Toast.LENGTH_SHORT).show();
    }

    public void pre(View view) {
        Intent i = new Intent(this, MyTuts.class);
        startActivity(i);
        finish();
    }
}