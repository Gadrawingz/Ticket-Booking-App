package com.example.ticketbookingapp.ui.home;

import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.ticketbookingapp.R;
import com.example.ticketbookingapp.WelcomeActivity;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home");
    }

    public LiveData<String> getText() {
        return mText;
    }

}