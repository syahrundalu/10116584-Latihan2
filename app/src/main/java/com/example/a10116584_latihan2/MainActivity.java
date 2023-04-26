package com.example.a10116584_latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    TextView register ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });
    }

}