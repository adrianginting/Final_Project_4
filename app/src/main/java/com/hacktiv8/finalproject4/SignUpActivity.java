package com.hacktiv8.finalproject4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class SignUpActivity extends AppCompatActivity {
    RelativeLayout btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUp =findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(view -> {
            startActivity(new Intent(this, InputPhoneActivity.class));
        });
    }
}