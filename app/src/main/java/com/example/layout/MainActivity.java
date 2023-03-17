package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnLoggin;
    EditText loginEml, loginPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginEml = findViewById(R.id.editText);
        loginPass = findViewById(R.id.editText2);
        btnLoggin = findViewById(R.id.button);

        btnLoggin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = loginEml.getText().toString();
                String pass = loginPass.getText().toString();

                if(email.equals("erwintamba7@gmail.com") && pass.equals("215150701111026")){
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent intentMove = new Intent(MainActivity.this, PakKumis.class);
                    startActivity(intentMove);
                } if (email.isEmpty() || pass.isEmpty()){
                    Toast.makeText(MainActivity.this, "Email dan Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Maaf Email dan Password salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
