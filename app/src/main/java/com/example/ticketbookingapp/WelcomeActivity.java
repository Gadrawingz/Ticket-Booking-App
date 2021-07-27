package com.example.ticketbookingapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    SharedPreferences prf;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        TextView result = (TextView) findViewById(R.id.loginSuccessView);
        Button btnLogOut = (Button) findViewById(R.id.btnLogOut);
        prf = getSharedPreferences("user_details", MODE_PRIVATE);
        intent = new Intent(WelcomeActivity.this, MainActivity.class);
        result.setText("Hello, " + prf.getString("username", null));
        btnLogOut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = prf.edit();
                editor.clear();
                editor.commit();
                startActivity(intent);
            }
        });

        // Link creation to go to Map
        TextView mapLinking = (TextView)findViewById(R.id.mapLink);
        mapLinking.setMovementMethod(LinkMovementMethod.getInstance());
        mapLinking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });


        // Link creation access menus
        TextView goToMenu = (TextView)findViewById(R.id.menusLink);
        goToMenu.setMovementMethod(LinkMovementMethod.getInstance());
        goToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, BottomMenus.class);
                startActivity(intent);
            }
        });

        // Link creation access menus
        TextView doBookNow = (TextView)findViewById(R.id.bookNowLink);
        doBookNow.setMovementMethod(LinkMovementMethod.getInstance());
        doBookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, BookingActivity.class);
                startActivity(intent);
            }
        });

        // Link creation access menus
        TextView useCam = (TextView)findViewById(R.id.captureLink);
        useCam.setMovementMethod(LinkMovementMethod.getInstance());
        useCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, CameraAccess.class);
                startActivity(intent);
            }
        });


    }
}