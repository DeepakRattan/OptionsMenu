package com.example.deepakrattan.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item1:
                Toast.makeText(MainActivity.this, "Item 1 is clicked", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(MainActivity.this, "Item 2 is clicked", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(MainActivity.this, "Item 3 is clicked", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item4:
                Toast.makeText(MainActivity.this, "Item 4 is clicked", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item5:
                Toast.makeText(MainActivity.this, "Item 5 is clicked", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
