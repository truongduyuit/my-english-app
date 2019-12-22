package com.example.myenglishapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);

        final TabGrammarFragment tabGrammarFragment = new TabGrammarFragment();
        final TabTestFragment tabTestFragment = new TabTestFragment();
        final TabGameFragment tabGameFragment = new TabGameFragment();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.tab_grammar_menu)
                {
                    setFragment(tabGrammarFragment);
                    return true;
                }
                else if (id == R.id.tab_test_menu)
                {
                    setFragment(tabTestFragment);
                    return true;
                }
                else if (id == R.id.tab_game_menu)
                {
                    setFragment(tabGameFragment);
                    return true;
                }
                return false;
            }
        });

        setFragment(tabGrammarFragment);
    }

    private void setFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }
}
