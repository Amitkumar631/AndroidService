package com.example.androidservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyServiceDemo extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public int onStartCommand(Intent intent, int flag,int startId)
    {
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        Log.d("Display","hi!");
        return START_STICKY;
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"Service Destroyed",Toast.LENGTH_LONG).show();

    }
}