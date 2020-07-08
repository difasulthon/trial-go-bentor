package com.example.trialgobentor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.trialgobentor.utils.SessionManager;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private int splashTime = 6000;
    SessionManager sessionManager;
    private boolean login;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        sessionManager = new SessionManager(getApplicationContext());
        login = sessionManager.getLogin();
        type = sessionManager.getType();

        buatJedaWkatu();
    }

    private void buatJedaWkatu() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
//                if (login == true) {
//                    if (type == "Drivers") {
//                        Intent Intent = new Intent(SplashActivity.this, DriverLoginActivity.class);
//                        startActivity(Intent);
//                        finish();
//                        return;
//                    }
//                    else if (type == "Customers") {
//                        Intent Intent = new Intent(SplashActivity.this, CustomerLoginActivity.class);
//                        startActivity(Intent);
//                        finish();
//                        return;
//                    }
//                }
//                else if (login == false){
                    moveToMainActivity();
//                }
            }
        }, splashTime);
    }

    private void moveToMainActivity() {
        Intent Intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(Intent);
        finish();
        return;
    }
}