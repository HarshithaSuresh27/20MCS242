package com.example.spinnerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] branches;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        branches=getResources().getStringArray(R.array.branches);
        Spinner s1 = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,branches);
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index=arg0.getSelectedItemPosition();
                Toast.makeText(getApplicationContext(),"Selected Item:"+branches[index],
                        Toast.LENGTH_LONG).show();
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
