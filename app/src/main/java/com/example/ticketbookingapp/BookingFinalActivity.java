package com.example.ticketbookingapp;

import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class BookingFinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_final);


        // Link for exiting final
        TextView quitFinal = (TextView)findViewById(R.id.exitFinal);
        quitFinal.setMovementMethod(LinkMovementMethod.getInstance());
        quitFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingFinalActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });


    }
}