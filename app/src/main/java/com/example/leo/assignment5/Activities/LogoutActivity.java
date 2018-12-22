package com.example.leo.assignment5.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.leo.assignment5.R;
import com.facebook.AccessToken;

public class LogoutActivity extends AppCompatActivity {

    private AccessToken accessToken = AccessToken.getCurrentAccessToken();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
    }

    public void SignOutOnClick(View v) {

    }
}