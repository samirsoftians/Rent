package com.softianstech.rent;

import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
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

//        webview.setWebViewClient(new CustomWebViewClient());

//        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        webView.getSettings().setAllowFileAccess(true);
//****************************************Changes here*************************
        String url ="http://tickets.musiconelive.com/admin/SACValidateBarcode.asp";
       // WebView wv=(WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setAllowFileAccess(true);
        webView.loadUrl(Links.links);
        //******************************changes ends here*******************************************





        /*webView.loadUrl(Links.links);//"https://www.nobroker.in"
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());*/

        //************************************************************************************************

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });


        return v;


    }



}
