package com.softianstech.rent;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Lenovo on 12/4/2017.
 */

public class FirstActivity extends AppCompatActivity {

TextView softians;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);



        softians=findViewById(R.id.softians);
        softians.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.navigate=0;

                Links.links="http://www.softianstech.com";

                DisplayLinks myJob = new DisplayLinks();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();

            }
        });


    ForgetPassword myJob = new ForgetPassword();
    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();

    }
    @Override
    public void onBackPressed() {
        if (Links.navigate==0)
        {
            ForgetPassword myJob = new ForgetPassword();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frame2, myJob);
            fragmentTransaction.commit();
        }
        else {
            finish();
        }

    }
}

