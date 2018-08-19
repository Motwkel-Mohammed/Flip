package com.example.motwkel.test_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText email = (EditText) findViewById(R.id.email);
        final EditText password = (EditText) findViewById(R.id.pass);
        final EditText phone = (EditText) findViewById(R.id.mob);
        final EditText again = (EditText) findViewById(R.id.again);
        final TextView sign = (TextView) findViewById(R.id.cont);
        final TextView signin = (TextView) findViewById(R.id.signin);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String email_logup = email.getText().toString();
                final String password_logup = password.getText().toString();
                final String again_logup = again.getText().toString();
                final String phone_logup = phone.getText().toString();
                if (!email_logup.matches("") && !password_logup.matches("") && !again_logup.matches("") && !phone_logup.matches("")) {
                    if (password_logup.equals(again_logup)) {

                        Intent intent = new Intent(MainActivity.this, LoginSuccess.class);
                        intent.putExtra("Email", email_logup);
                        intent.putExtra("Password", password_logup);
                        intent.putExtra("Phone", phone_logup);
                        startActivity(intent);
                    } else
                        Toast.makeText(MainActivity.this, "Password Not Match", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Complied all of the information!", Toast.LENGTH_SHORT).show();
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });


    }
}
