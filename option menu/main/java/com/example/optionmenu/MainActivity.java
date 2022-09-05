package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void CreateMenu(Menu menu)
    {
        menu.add(0,0,0,"item-1");
        menu.add(0,1,1,"item-2");
        menu.add(0,2,2,"item-3");
        menu.add(0,3,3,"item-4");
        menu.add(0,4,4,"item-5");
    }
    private boolean MenuChoice(MenuItem item)
    {
        switch (item.getItemId())
        {
            case 0:
                Toast.makeText(this,"Selected item-1",Toast.LENGTH_LONG).show();
                return true;
            case 1:

                Toast.makeText(this,"Selected item-2",Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this,"Selected item-3",Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this,"Selected item-4",Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this,"Selected item-5",Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return MenuChoice(item);
    }

}