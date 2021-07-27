package com.example.ticketbookingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.text.method.LinkMovementMethod;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variables declaration
    EditText uname, pwd;
    TextView register;
    Button loginBtn;
    SharedPreferences pref;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText) findViewById(R.id.txtUsername);
        pwd = (EditText) findViewById(R.id.txtPassword);
        loginBtn = (Button) findViewById(R.id.btnLogin);

        pref = getSharedPreferences("user_details", MODE_PRIVATE);
        intent = new Intent(MainActivity.this, WelcomeActivity.class);

        if (pref.contains("username") && pref.contains("password")) {
            startActivity(intent);
        }

        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username = uname.getText().toString();
                String password = pwd.getText().toString();

                if (username.equals("Huguette") && password.equals("hmiss21")) {
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("username", username);
                    editor.putString("password", password);
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Credentials are not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });


        TextView register = (TextView)findViewById(R.id.registerLink);
        register.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });



    }
}