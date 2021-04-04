package com.example.mylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AndroidHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_history);
    }

    public void pre(View view) {
        Intent i = new Intent(this, Tutorials.class);
        startActivity(i);
        finish();
    }

    public void next(View view) {
        Intent i = new Intent(this, MyTuts.class);
        startActivity(i);
        finish();
    }
}