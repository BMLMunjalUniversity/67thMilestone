package com.bml67.android.a67thmilestonebml;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

public class SplashScreen extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 3000;
    public boolean isFirstStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //  Intro App Initialize SharedPreferences
                        SharedPreferences getSharedPreferences = PreferenceManager
                                .getDefaultSharedPreferences(getBaseContext());

                        //  Create a new boolean and preference and set it to true
                        isFirstStart = getSharedPreferences.getBoolean("firstStart", true);

                        //  Check either activity or app is open very first time or not and do action
                        if (isFirstStart) {

                            //  Launch application introduction screen
                            Intent i = new Intent(SplashScreen.this, IntroActivity.class);
                            startActivity(i);
                            SharedPreferences.Editor e = getSharedPreferences.edit();
                            e.putBoolean("firstStart", false);
                            e.apply();
                        }
                        else
                        {
                            Intent i = new Intent(SplashScreen.this, MainActivity.class);
                            startActivity(i);
                        }
                    }
                });
                t.start();

            }
        }, SPLASH_TIME_OUT);
    }

}