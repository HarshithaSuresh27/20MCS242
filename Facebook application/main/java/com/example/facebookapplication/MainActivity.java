package com.example.facebookapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void friends(View view) {
        Intent i = new Intent(this,FriendsActivity.class);
        startActivity(i);
    }
    public void chat(View view)
    {
        Intent i = new Intent(this,ChatActivity.class);
        startActivity(i);
    }
    public void notification(View view)
    {
        Intent i = new Intent(this,NtificationActivity.class);
        startActivity(i);
    }
    public void setting(View view)
    {
        Intent i = new Intent(this,SettingActivity.class);
        startActivity(i);
    }
}