package com.example.mylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Tutorials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorials);


    }
    public void version(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }

    public void why(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }

    public void lifecycle(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }

    public void layout(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }

    public void history(View view) {
        Intent i = new Intent(this, AndroidHistory.class);
        startActivity(i);
        finish();
    }

    public void intro(View view) {
        Intent i = new Intent(this, AndroidIntro.class);
        startActivity(i);
        finish();
    }

    public void ui(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }

    public void servies(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }
    public void resources(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }
    public void eg(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }
    public void to(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }
    public void eh(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }

    public void ss(View view) {
        Toast.makeText(this,"Coming Soon ...!!!",Toast.LENGTH_SHORT).show();
    }
}