package com.example.capybaraapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean nextAlarmVisible=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.alarm_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.show_next_alarm:

                if(nextAlarmVisible){
                    item.setIcon(R.drawable.ic_menu_hide_next_alarm);
                    Toast.makeText(this, "sdfg", Toast.LENGTH_SHORT).show();
                }
                else {
                    item.setIcon(R.drawable.ic_menu_show_next_alarm);
                    Toast.makeText(this, "sdfg", Toast.LENGTH_SHORT).show();}
                nextAlarmVisible= !nextAlarmVisible;
                return true;
            case R.id.new_alarm:
                Intent intent = new Intent(this, AddAlarmActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}