package com.example.ticketbookingapp;

import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class NewBooking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_booking);

        // Link creation access menus
        TextView useCam = (TextView)findViewById(R.id.linkPayment);
        useCam.setMovementMethod(LinkMovementMethod.getInstance());
        useCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewBooking.this, BookingFinalActivity.class);
                startActivity(intent);
            }
        });

    }
}