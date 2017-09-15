package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";
    MyHandlerThread myHandlerThread = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        myHandlerThread = new MyHandlerThread("onStartHandlerThread");

        myHandlerThread.start();
        Log.i("Old Thread", "old Thread");
    }

    public void PopUpWindow(View view) {

    }

}
