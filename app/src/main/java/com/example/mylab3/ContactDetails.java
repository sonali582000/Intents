package com.example.mylab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ContactDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        TextView textView=(TextView)findViewById(R.id.textView1);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }


    public void map(View view) {
            Intent a=new Intent(Intent.ACTION_VIEW);
            a.setData(Uri.parse("geo:12.3656489.88.4569875"));
            Intent chooser= Intent.createChooser(a, "Reach us via: ");
            startActivity(chooser);
    }

    public void callus(View view) {
        Intent i= new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+919974339652"));
        startActivity(i);
    }

    public void mailus(View view) {
        Intent j=new Intent(Intent.ACTION_SEND);
        j.setData(Uri.parse("email"));
        String[] s={"sonalirathod724@gmail.com"};
        j.putExtra(Intent.EXTRA_EMAIL,s);
        j.putExtra(Intent.EXTRA_SUBJECT,"Complaint register");
        j.putExtra(Intent.EXTRA_TEXT,"");
        j.setType("message/rfc822");
        Intent chooser = Intent.createChooser(j,"Mail Us Via:");
        startActivity(chooser);
    }

    public void visitus(View view) {
            String url="https://christuniversity.in/";
            Intent s=new Intent(Intent.ACTION_VIEW);
            s.setData(Uri.parse(url));
            startActivity(s);
    }

    public void pre(View view) {
        Intent i = new Intent(this, MyTuts.class);
        startActivity(i);
        finish();
    }
}