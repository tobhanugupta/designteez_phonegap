package com.example.designteez;

import org.apache.cordova.CordovaActivity;

import android.os.Bundle;

public class MainActivity extends CordovaActivity 
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        // Set by <content src="index.html" /> in config.xml
        //super.setIntegerProperty("loadUrlTimeoutValue", 90000);
         // super.loadUrl(Config.getStartUrl());
        super.setIntegerProperty("splashscreen", R.drawable.splash);       
        super.loadUrl("file:///android_asset/www/index.html",3000);
        //super.loadUrl("file:///android_asset/www/index.html");
     
    }
}

