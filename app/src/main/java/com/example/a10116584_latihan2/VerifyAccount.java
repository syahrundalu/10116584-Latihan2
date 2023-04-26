package com.example.a10116584_latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VerifyAccount extends AppCompatActivity {

    TextView btnVerification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);

        btnVerification = findViewById(R.id.btnVerification);

        btnVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerifyAccount.this, Profile.class));
            }
        });
    }
}