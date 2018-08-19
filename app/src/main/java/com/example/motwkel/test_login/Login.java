package com.example.motwkel.test_login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText email = (EditText) findViewById(R.id.email);
        final EditText password = (EditText) findViewById(R.id.pass);
        final TextView sign = (TextView) findViewById(R.id.cont);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this, LoginSuccess.class);

                final String email_logup = email.getText().toString();
                final String password_logup = password.getText().toString();
                if (!email_logup.matches("") && !password_logup.matches("")) {


                    intent.putExtra("Email", email_logup);
                    intent.putExtra("Password", password_logup);
                    startActivity(intent);
                } else
                    Toast.makeText(Login.this, "Complied all of the information! ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
