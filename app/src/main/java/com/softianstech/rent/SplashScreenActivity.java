package com.softianstech.rent;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class SplashScreenActivity extends AppCompatActivity {
    public static SharedPreferences sharedpreferences;


    public static int  splash=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);



        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {



                    splash=1;
                    Intent ints = new Intent(SplashScreenActivity.this, FirstActivity.class);

                    ints.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(ints);
                    finish();

            }
        }, 3000);








    }
}
