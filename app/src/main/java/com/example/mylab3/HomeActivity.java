package com.example.mylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText e1, e2, e3, e4;
    Button b1;
    String unameVal,passVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        e3=findViewById(R.id.editText3);
        e4=findViewById(R.id.editText4);
        b1=findViewById(R.id.button);
    }

    public void registration(View view) {
        String name, phone, email, pass;

        name = e1.getText().toString();
        phone = e2.getText().toString();
        email = e3.getText().toString();
        pass = e4.getText().toString();

        if (name.equals("")) {
            Toast.makeText(this, "Name is Blank", Toast.LENGTH_SHORT).show();
        }  if (phone.equals("")) {
            Toast.makeText(this, "Phone number is Blank", Toast.LENGTH_SHORT).show();
        } if (email.equals("")) {
            Toast.makeText(this, "Email is Blank", Toast.LENGTH_SHORT).show();
        }  if (pass.equals("")) {
            Toast.makeText(this, "Password is Blank", Toast.LENGTH_SHORT).show();
        }

        if (!name.isEmpty() && !phone.isEmpty() && !email.isEmpty() && !pass.isEmpty()) {
            Intent i = new Intent(this, Login.class);
            unameVal=e1.getText().toString();
            passVal=e4.getText().toString();
            i.putExtra("Username",unameVal);
            i.putExtra("Password",passVal);
            startActivity(i);
            finish();
        }
    }
}