package com.example.motwkel.test_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginSuccess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);


        TextView email_success = (TextView) findViewById(R.id.email_success);
        TextView password_success = (TextView) findViewById(R.id.password_success);
        final TextView mobile_success = (TextView) findViewById(R.id.mobile_success);

        Intent i = getIntent();

        final String email_logup = i.getStringExtra("Email");
        final String password_logup = i.getStringExtra("Password");
        final String phone_logup = i.getStringExtra("Phone");

        if (phone_logup == null) {
            mobile_success.setText("exist");
        } else if (phone_logup.equals("")) {
            mobile_success.setText("require later");
        } else {
            mobile_success.setText(phone_logup + "");
        }
        email_success.setText(email_logup + "");
        password_success.setText(password_logup + "");

        email_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginSuccess.this, email_logup, Toast.LENGTH_SHORT).show();
            }
        });

        password_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginSuccess.this, password_logup, Toast.LENGTH_SHORT).show();
            }
        });

        mobile_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (phone_logup == null) {
                    Toast.makeText(LoginSuccess.this, "exist", Toast.LENGTH_SHORT).show();
                } else if (phone_logup.equals("")) {
                    Toast.makeText(LoginSuccess.this, "require later", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginSuccess.this, phone_logup , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
