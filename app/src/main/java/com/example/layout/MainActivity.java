package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLoggin;
    EditText loginEml, loginPass;
    TextView register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEml = findViewById(R.id.email);
        loginPass = findViewById(R.id.pass);
        btnLoggin = findViewById(R.id.masuk);
        register = findViewById(R.id.register);

        btnLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = loginEml.getText().toString();
                String pass = loginPass.getText().toString();

                if(email.equals("erwintamba7@gmail.com") && pass.equals("215150701111026")){
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent intentMove = new Intent(MainActivity.this, PakKumis.class);
                    intentMove.putExtra("email_key", email);
                    startActivity(intentMove);
                } else {
                    Toast.makeText(MainActivity.this, "Email atau Password Anda salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterAktivity.class);
                startActivity(intent);
            }
        });
    }

    protected void onStop(){
        super.onStop();
        loginEml.setText("");
        loginPass.setText("");
    }
}
