package com.natalieperna.fantasticbroccoli;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Welcome text view
        TextView welcomeDisplay = (TextView) findViewById(R.id.welcomeView);

        // Get shared preferences
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        // Check if logged in, and get email and token
        boolean loggedIn = sharedPrefs.getBoolean(Config.SharedPref.LOGGEDIN, false);

        if (loggedIn) {
            String email = sharedPrefs.getString(Config.SharedPref.EMAIL, null);
            String token = sharedPrefs.getString(Config.SharedPref.TOKEN, null);
            if (email != null && token != null && !email.isEmpty() && !token.isEmpty()) {
                String welcome = "Welcome, " + email + "! Your token is: " + token + ".";
                welcomeDisplay.setText(welcome);
            }
        }
    }
}
