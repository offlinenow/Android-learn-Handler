package com.example.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            String string = msg.obj.toString();
            TextView textView = findViewById(R.id.TextView1);
            textView.setText(string);
        }
    };
    final Runnable mywork = new Runnable() {
        @Override
        public void run() {
            Looper.prepare();
            Message message = Message.obtain();
            message.obj = "New Thread";
            message.what = 10;
            handler.sendMessage(message);
            Looper.loop();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {
        Thread thread = new Thread(mywork);
        thread.start();


    }

    public void PopUpWindow(View view) {

    }

}
