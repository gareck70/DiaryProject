package com.example.diaryproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DiaryActivity extends AppCompatActivity {
    ListFragment   listFragment   =  new ListFragment();
    StatusFragment statusFragment =  new StatusFragment();
    WriteFragment  writeFragment  =  new WriteFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary_activity);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, listFragment).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.bottom_tab1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, listFragment).commit();
                        return true;

                    case R.id.bottom_tab2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, writeFragment).commit();
                        return true;

                    case R.id.bottom_tab3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, statusFragment).commit();
                        return true;
                }
                return false;
            }
        });

}
}
