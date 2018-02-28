package com.example.nyam.task2;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class App extends Application {

    private Date date = new Date();
    private Intent mainActivity;
    private Intent mainBadActivity;

    public final BroadcastReceiver screenOffReciever = new BroadcastReceiver() {
        @Override
        public void onReceive(final Context context, final Intent intent) {
            if (intent != null && Intent.ACTION_SCREEN_OFF.equals(intent.getAction())) {
                date = new Date();
                System.out.println("SCREEN OFF");
            }
        }
    };

    public final BroadcastReceiver screenOnReciever = new BroadcastReceiver() {
        @Override
        public void onReceive(final Context context, final Intent intent) {
            if (intent != null && Intent.ACTION_SCREEN_ON.equals(intent.getAction())) {
                System.out.println("SCREEN On");
                Date currentDate = new Date();
                if(currentDate.getTime() - date.getTime() < 3000) {
                    startActivity(mainBadActivity);
                } else {
                    startActivity(mainActivity);
                }
            }
        }
    };

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("App", "onCreate");

        IntentFilter intentFilterOn = new IntentFilter(Intent.ACTION_SCREEN_ON);
        IntentFilter intentFilterOff = new IntentFilter(Intent.ACTION_SCREEN_OFF);
        intentFilterOn.addAction(Intent.ACTION_SCREEN_ON);
        intentFilterOff.addAction(Intent.ACTION_SCREEN_OFF);
        registerReceiver(screenOnReciever, intentFilterOn);
        registerReceiver(screenOffReciever, intentFilterOff);

        mainActivity = new Intent(this, MainActivity.class);
        mainBadActivity = new Intent(this, MainActivityBad.class);
        startActivity(mainActivity);
    }
}
