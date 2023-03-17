package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PakKumis extends AppCompatActivity implements View.OnClickListener{

    ImageView hair, eyebrow, moustache, beard;
    CheckBox viewHair, viewEyebrow, viewMoustache, viewBeard;

    Button bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pak_kumis);

        hair = findViewById(R.id.hair);
        eyebrow = findViewById(R.id.eyebrow);
        moustache = findViewById(R.id.moustache);
        beard = findViewById(R.id.beard);

        viewHair = findViewById(R.id.viewHair);
        viewEyebrow = findViewById(R.id.viewEyebrow);
        viewMoustache = findViewById(R.id.viewMoustache);
        viewBeard = findViewById(R.id.viewBeard);

        hair.setVisibility(View.INVISIBLE);
        eyebrow.setVisibility(View.INVISIBLE);
        moustache.setVisibility(View.INVISIBLE);
        beard.setVisibility(View.INVISIBLE);

        viewHair.setOnClickListener(this);
        viewEyebrow.setOnClickListener(this);
        viewMoustache.setOnClickListener(this);
        viewBeard.setOnClickListener(this);

//        if(savedInstanceState == null){
//            Bundle extras = getIntent().getExtras();
//
//            if(extras != null){
//                this.email = extras.getString("email");
//                this.password = extras.getString("password");
//            }
//
//            String newWelcome = "";
//            newWelcome = welcome.getText().toString();
//            newWelcome += this.email;
//            welcome.setText(newWelcome);
//        }
//        viewHair.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
//                if(checked){
//                    hair.setVisibility(View.VISIBLE);
//                } else {
//                    hair.setVisibility(View.INVISIBLE);
//                }
//            }
//        });
//
//        viewBeard.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
//                if(checked){
//                    beard.setVisibility(View.VISIBLE);
//                } else {
//                    beard.setVisibility(View.INVISIBLE);
//                }
//            }
//        });
//
//        viewMoustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
//                if(checked){
//                    moustache.setVisibility(View.INVISIBLE);
//                } else {
//                    moustache.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//        viewEyebrow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
//                if(checked){
//                    eyebrow.setVisibility(View.INVISIBLE);
//                } else {
//                    eyebrow.setVisibility(View.VISIBLE);
//                }
//            }
//        });
//
//        Call.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent moveIntent = new Intent(PakKumis.this, MainActivity.class);
//                startActivity(moveIntent);
//            }
//        });
    }
    public void onClick (View view){
        if(view.getId() == viewHair.getId()) {
            if(hair.getVisibility() == View.INVISIBLE){
                hair.setVisibility(View.VISIBLE);
            } else {
                hair.setVisibility(View.INVISIBLE);
            }
        } else if (view.getId() == viewEyebrow.getId()){
            if(eyebrow.getVisibility() == View.INVISIBLE){
                eyebrow.setVisibility(View.VISIBLE);
            } else {
                eyebrow.setVisibility(View.INVISIBLE);
            }
        } else if (view.getId() == viewMoustache.getId()) {
            if(moustache.getVisibility() == View.INVISIBLE){
                moustache.setVisibility(View.VISIBLE);
            } else {
                moustache.setVisibility(View.INVISIBLE);
            }
        } else if (view.getId() == viewBeard.getId()) {
            if(beard.getVisibility() == View.INVISIBLE){
                beard.setVisibility(View.VISIBLE);
            } else {
                beard.setVisibility(View.INVISIBLE);
            }
        }
    }
}
