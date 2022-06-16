package com.hacktiv8.finalproject4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class SignUpSuccessActivity extends AppCompatActivity {
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_success);

        btnNext =findViewById(R.id.btnNext);
        btnNext.setOnClickListener(view -> {
            startActivity(new Intent(this, MainActivity.class));
        });


    }
}