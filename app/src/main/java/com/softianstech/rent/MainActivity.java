package com.softianstech.rent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frame1,card2,card3,card4,card5,card6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cornor_radius);

      //  toolbar.setBackgroundColor(Color.parseColor("#80000000"));

        frame1=(FrameLayout)findViewById(R.id.frame1);
        card2=(FrameLayout)findViewById(R.id.card2);
        card3=(FrameLayout)findViewById(R.id.card3);
        card4=(FrameLayout)findViewById(R.id.card4);
        card5=(FrameLayout)findViewById(R.id.card5);
        card6=(FrameLayout)findViewById(R.id.card6);

        frame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Links.links="https://www.nobroker.in";
                Intent i= new Intent(MainActivity.this,Display.class);
                startActivity(i);
            }
        });


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.magicbricks.com";
                Intent i= new Intent(MainActivity.this,Display.class);
                startActivity(i);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.99acres.com";
                Intent i= new Intent(MainActivity.this,Display.class);
                startActivity(i);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.makaan.com";
                Intent i= new Intent(MainActivity.this,Display.class);
                startActivity(i);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://housing.com";
                Intent i= new Intent(MainActivity.this,Display.class);
                startActivity(i);
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.commonfloor.com";
                Intent i= new Intent(MainActivity.this,Display.class);
                startActivity(i);
            }
        });
    }
}
