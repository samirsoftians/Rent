package com.softianstech.rent;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Lenovo on 12/4/2017.
 */

public class DisplayLinks extends Fragment {

    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View v=inflater.inflate(R.layout.webview,container,false);


        //=====================================================================================================
        final ProgressDialog myPd_ring= ProgressDialog.show(getContext(), "", "Please wait......", true);
        myPd_ring.setCancelable(true);
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                // TODO Auto-generated method stub
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e){

                }
                myPd_ring.dismiss();
            }
        }).start();
        //================================================================================================================

        webView = (WebView) v.findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(Links.links);//"https://www.nobroker.in"
        webView.setWebViewClient(new WebViewClient());





        return v;


    }


}
