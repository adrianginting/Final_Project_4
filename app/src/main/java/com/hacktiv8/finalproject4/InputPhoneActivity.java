package com.hacktiv8.finalproject4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class InputPhoneActivity extends AppCompatActivity {
    Button btnSaveNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_phone);

        btnSaveNumber =findViewById(R.id.btnSaveNumber);
        btnSaveNumber.setOnClickListener(view -> {
            startActivity(new Intent(this, SignUpSuccessActivity.class));
        });
    }
}