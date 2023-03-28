package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactUs extends AppCompatActivity {
    Button call, email, website;
    TextView desc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        desc = findViewById(R.id.descrip);
        call = findViewById(R.id.call_us);
        email = findViewById(R.id.send_email);
        website = findViewById(R.id.viewWebsite);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL);
                intentCall.setData(Uri.parse("tel: +622273844035"));
                startActivity(intentCall);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setemail = new Intent(Intent.ACTION_SENDTO);
                setemail.setAction(Intent.ACTION_SEND);
                setemail.setType("message/rfc822");
                setemail.putExtra(Intent.EXTRA_EMAIL, new String[] {"erwintamba7@gmail.com"});
                setemail.putExtra(android.content.Intent.EXTRA_CC,"");
                setemail.putExtra(android.content.Intent.EXTRA_BCC,"");
                setemail.putExtra(Intent.EXTRA_SUBJECT,"Subject");
                setemail.putExtra(Intent.EXTRA_TEXT, "Email body");
                setemail.setType("text/html");
                startActivity(Intent.createChooser(setemail, "Send Email Using"));
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setwebsite = new Intent(Intent.ACTION_VIEW);
                setwebsite.setData(Uri.parse("https://google.com"));
                startActivity(setwebsite);
            }
        });
    }
}