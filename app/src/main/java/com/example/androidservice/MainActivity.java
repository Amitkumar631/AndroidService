package com.example.androidservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button startService, stopService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyServiceMessage","Service is created");


        startService=(Button)findViewById(R.id.startServiceButton);
        stopService=(Button)findViewById(R.id.stopServiceButton);



        startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(getCurrentFocus());
            }
        });

        stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(getCurrentFocus());
            }
        });
        {

        }
    }

    public void startService(View view)
    {
        startService(new Intent(getBaseContext(),MyServiceDemo.class));
    }

    public void stopService(View view)
    {
        stopService(new Intent(getBaseContext(), MyServiceDemo.class));
    }
}