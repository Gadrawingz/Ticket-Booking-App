package com.example.ticketbookingapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.ticketbookingapp.R;

public class BookingActivity extends AppCompatActivity {

    // Declaration
    ListView lview;
    ArrayAdapter arAd;
    private String[] agencies = {
            "Horizon Car", "Virunga Car", "KBS Car",
            "Kivu Belt Car", "Volano Car", "Alpha Car",
            "Matunda Car", "Stella Car", "Virunga SemiCars"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        lview = (ListView)findViewById(R.id.agenciesList);
        arAd = new ArrayAdapter(this, android.R.layout.simple_list_item_1, agencies);
        lview.setAdapter(arAd);


        // Link creation to go to Map
        TextView addAction = (TextView)findViewById(R.id.bookingScreen);
        addAction.setMovementMethod(LinkMovementMethod.getInstance());
        addAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingActivity.this, NewBooking.class);
                startActivity(intent);
            }
        });


    }
}