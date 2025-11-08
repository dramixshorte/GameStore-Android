package com.GamesComplex.games;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;


@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {


    private AppOpenManager appOpenManager;
    private CountDownTimer countDownTimer;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        progressBar = findViewById(R.id.progress_loader);

        MobileAds.initialize(SplashActivity.this, initializationStatus -> {});

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();


        if (netInfo!= null && netInfo.isConnectedOrConnecting()) {
            appOpenManager = new AppOpenManager(SplashActivity.this);
            appOpenManager.fetchAd(getResources().getString(R.string.App_Open_Ads_ID));

            countDownTimer = new CountDownTimer(10000, 1000) {
                public void onTick(long millisUntilFinished) {

                    if (AppOpenManager.adsisLoaded()) {
                        progressBar.setVisibility(View.VISIBLE);
                        appOpenManager.showAdIfAvailable();
                        countDownTimer.cancel();
                        Log.d("mmmm", "ads is show");
                    }

                }

                public void onFinish() {
                    if (!AppOpenManager.adsisLoaded()) {
                        progressBar.setVisibility(View.VISIBLE);
                        intentToHomeScreen();
                    }

                }

            }.start();

        } else {
            Toast.makeText(this, "Please Connect To Internet", Toast.LENGTH_LONG).show();
            //countDownTimer.cancel();
            new Handler().postDelayed(() -> {
                intentToHomeScreen();
                progressBar.setVisibility(View.GONE);
            }, 3000);
        }


    }

    public void intentToHomeScreen() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 300);
    }

    public void stopCountdown() {
        countDownTimer.cancel();
        Log.d("mmmm", "stop countdown");
    }
}
