package com.example.c0753560_mad3125_midterm;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtEmail, edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.buttonLogin);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtpassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (edtEmail.getText().toString().trim().length() == 0) {
                    edtEmail.setError("Enter a valid Email");
                } else if (edtPass.getText().toString().trim().length() == 0) {
                    edtPass.setError("Enter Password");
                }

                if (edtEmail.getText().toString().equals("admin@gmail.com") && edtPass.getText().toString().equals("admin123")) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {


                }


            }
        });
    }
}
