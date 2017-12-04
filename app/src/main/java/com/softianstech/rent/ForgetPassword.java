package com.softianstech.rent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by Lenovo on 6/6/2017.
 */

public class ForgetPassword extends Fragment {

    FrameLayout frame1,card2,card3,card4,card5,card6;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View v=inflater.inflate(R.layout.layout_cornor_radius,container,false);

        frame1=(FrameLayout)v.findViewById(R.id.frame1);
        card2=(FrameLayout)v.findViewById(R.id.card2);
        card3=(FrameLayout)v.findViewById(R.id.card3);
        card4=(FrameLayout)v.findViewById(R.id.card4);
        card5=(FrameLayout)v.findViewById(R.id.card5);
        card6=(FrameLayout)v.findViewById(R.id.card6);




//        eid= (EditText) v.findViewById(R.id.email_id);
//        submit= (Button)v.findViewById(R.id.btnsubmit);


        frame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Links.links="https://www.nobroker.in";//



//                DisplayLinks m= new DisplayLinks();
//
//                FragmentTransaction fragmentTransaction= getChildFragmentManager().beginTransaction();
//                fragmentTransaction.replace(R.id.frame2,m);
//                fragmentTransaction.commit();

                DisplayLinks myJob = new DisplayLinks();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();
//


//                Intent i= new Intent(getContext(),Display.class);
//                startActivity(i);
            }
        });


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.magicbricks.com";

                DisplayLinks myJob = new DisplayLinks();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();
//                Intent i= new Intent(getContext(),Display.class);
                //startActivity(i);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.99acres.com";
                DisplayLinks myJob = new DisplayLinks();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();
//                Intent i= new Intent(getContext(),Display.class);
//                startActivity(i);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.makaan.com";
                DisplayLinks myJob = new DisplayLinks();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();
//                Intent i= new Intent(getContext(),Display.class);
//                startActivity(i);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://housing.com";
                DisplayLinks myJob = new DisplayLinks();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Links.links="https://www.commonfloor.com";
                DisplayLinks myJob = new DisplayLinks();
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame2, myJob);
                fragmentTransaction.commit();
//                Intent i= new Intent(getContext(),Display.class);
//                startActivity(i);
            }
        });





        return v;


    }



}
