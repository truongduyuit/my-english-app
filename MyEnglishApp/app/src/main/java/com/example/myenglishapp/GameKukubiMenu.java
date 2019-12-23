package com.example.myenglishapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class GameKukubiMenu extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Duy");

    Button btn_play, btn_settings, btn_best_score;

    int level, music;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_kukubi_menu);

        // Ẩn action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        anhXa();
        addEventClickMenu();

        getDataSettingsFromFirebase();
    }

    private void anhXa()
    {
        btn_play = (Button) findViewById(R.id.btn_play);
        btn_settings = (Button) findViewById(R.id.btn_settings);
        btn_best_score = (Button) findViewById(R.id.btn_best_score);
    }

    private void addEventClickMenu()
    {
        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameKukubiMenu.this, GameKukubiScreenPlay.class);
                intent.putExtra("level", level);
                intent.putExtra("music", music);
                startActivity(intent);
            }
        });

        btn_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog  = new Dialog(GameKukubiMenu.this);
                dialog.setContentView(R.layout.tab_game_kukubi_settings);
                dialog.setTitle("SETTINGS");

                final SeekBar sb_level = (SeekBar) dialog.findViewById(R.id.sb_level);
                final CheckBox cb_music = (CheckBox) dialog.findViewById(R.id.cb_music);
                Button btn_ok_settings = (Button) dialog.findViewById(R.id.btn_ok_settings);

                sb_level.setProgress(level);
                if (music == 1)
                {
                    cb_music.setChecked(true);
                }

                btn_ok_settings.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (cb_music.isChecked()) music = 1;
                        else music = 0;

                        level = sb_level.getProgress();

                        myRef.child("settings").child("level").setValue(level);
                        myRef.child("settings").child("music").setValue(music);

                        Toast.makeText(GameKukubiMenu.this, "Update setiings successfull", Toast.LENGTH_LONG).show();
                        dialog.cancel();
                    }
                });

                dialog.setCanceledOnTouchOutside(false);
                dialog.show();
            }
        });

        btn_best_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        DataSnapshot data = dataSnapshot.child("bestscore");
                        String bestScore = data.getValue().toString();

                        AlertDialog.Builder dialog = new AlertDialog.Builder(GameKukubiMenu.this);
                        dialog.setTitle("Điểm cao nhất");
                        dialog.setMessage(bestScore);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        dialog.show();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }

    private void getDataSettingsFromFirebase()
    {
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                DataSnapshot settings = dataSnapshot.child("settings");

                level = Integer.parseInt(settings.child("level").getValue().toString());
                music = Integer.parseInt(settings.child("music").getValue().toString());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
