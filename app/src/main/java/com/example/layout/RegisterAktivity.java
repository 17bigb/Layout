package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterAktivity extends AppCompatActivity {

    Button bttnRegis;
    EditText editEmail, editPass;
    TextView viewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_aktivity);

        bttnRegis = findViewById(R.id.regis);
        editEmail = findViewById(R.id.email);
        editPass = findViewById(R.id.pass);
        viewLogin = findViewById(R.id.login2);

        bttnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editEmail.getText().toString().trim();
                String password = editPass.getText().toString().trim();

                if(email.isEmpty() || password.isEmpty()){
                    Toast.makeText(RegisterAktivity.this, "Email dan Password masih kosong!", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("email", email);
                    intent.putExtra("password", password);
                    startActivity(intent);
                }
            }
        });
    }

    protected void onStop() {
        super.onStop();
        editEmail.setText("");
        editPass.setText("");
    }
}