package com.softianstech.rent;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Lenovo on 12/2/2017.
 */

public class Display extends Activity {
    private WebView webView;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        //=====================================================================================================
        final ProgressDialog myPd_ring= ProgressDialog.show(Display.this, "", "Please wait......", true);
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

        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl(Links.links);//"https://www.nobroker.in"
        webView.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack())
        {
            webView.goBack();
        }
        else
        {

            super.onBackPressed();
        }
    }

}
