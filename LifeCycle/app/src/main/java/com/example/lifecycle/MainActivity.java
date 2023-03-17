package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("lifecycle", "onCreate invoked");
    }
    @Override protected void onStart()
    {
        super.onStart();
        Log.e("lifecycle", "onStart invoked");
    }
    @Override protected void onResume()
    {
        super.onResume();
        Log.e("lifecycle", "onResume invoked");
    }
    @Override protected void onPause()
    {
        super.onPause();
        Log.e("lifecycle", "onPause invoked");
    }
    @Override protected void onStop()
    {
        super.onStop();
        Log.e("lifecycle", "onStop invoked");
    }
    @Override protected void onRestart()
    {
        super.onRestart();
        Log.e("lifecycle", "onRestart invoked");
    }
    @Override protected void onDestroy()
    {
        super.onDestroy();
        Log.e("lifecycle", "onDestroy invoked");
    }
}
