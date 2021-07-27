package com.example.ticketbookingapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ticketbookingapp.R;

public class HomeBooking extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);

        // Link creation access menus
        /*TextView goToMenu = (TextView)findViewById(R.id.homeLinkOne);
        goToMenu.setMovementMethod(LinkMovementMethod.getInstance());
        goToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeBooking.this, BookingActivity.class);
                startActivity(intent);
            }
        });*/

    }
}
