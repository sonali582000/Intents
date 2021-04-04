package com.example.mylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    String valFromAct1Uname,valFromAct1Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        b1=findViewById(R.id.button);

        valFromAct1Uname=getIntent().getExtras().getString("Username");
        valFromAct1Pass=getIntent().getExtras().getString("Password");
    }

    public void login(View view) {
        String uname,pswd;

        uname=e1.getText().toString();
        pswd=e2.getText().toString();
        if (uname.equals("")) {
            Toast.makeText(this, "Username is Blank", Toast.LENGTH_SHORT).show();
        }  if (pswd.equals("")) {
            Toast.makeText(this, "Password is Blank", Toast.LENGTH_SHORT).show();
        }

        if (!uname.isEmpty() && !pswd.isEmpty()) {
            if (uname.equals(valFromAct1Uname) && pswd.equals(valFromAct1Pass)) {
                Intent i = new Intent(this, MyTuts.class);
                startActivity(i);
                finish();
            } else {

                Toast t1 = Toast.makeText(this, "Username or Password is invalid..!!", Toast.LENGTH_SHORT);
                t1.setGravity(Gravity.BOTTOM, 0, 0);
                t1.show();
            }
        }
    }
}