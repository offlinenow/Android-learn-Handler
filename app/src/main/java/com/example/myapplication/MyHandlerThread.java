package com.example.myapplication;

import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;

public class MyHandlerThread extends HandlerThread {
    MyHandlerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Looper.prepare();
        Log.i("New Thread", "Hello World");
        Looper.loop();
    }

}
