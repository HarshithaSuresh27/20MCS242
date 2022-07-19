package com.example.passingresults;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText uname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = findViewById(R.id.editText);
    }
    public void first(View view)
    {
        String username =uname.getText().toString();
        Intent i =new Intent(getApplicationContext(),SecondActivity.class);
        i.putExtra("enteredData",username);
        startActivity(i);
    }
}