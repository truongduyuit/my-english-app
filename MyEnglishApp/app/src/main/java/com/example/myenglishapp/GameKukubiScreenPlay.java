package com.example.myenglishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GameKukubiScreenPlay extends AppCompatActivity {

    TextView tv_time;
    TextView tv_score;
    GridView gv;
    GameKukubiHelper helper = new GameKukubiHelper();
    ArrayList arr;

    int rows;
    int score;
    int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_kukubi_screen_play);

        score = 0;
        level = 1;
        rows = 2;

        mapping();
        settingGameBoard(rows);
        setDataForGameBoard();
        setOnClick();
    }

    private void mapping()
    {
        tv_time = (TextView) findViewById(R.id.tvTime);
        tv_score = (TextView) findViewById(R.id.tvScore);
        gv = (GridView) findViewById(R.id.game_board);
    }

    private void settingGameBoard(int iRows)
    {
        gv.setNumColumns(iRows);
    }

    private void setDataForGameBoard()
    {
        arr = new ArrayList(helper.createColor((int)Math.pow(rows, 2)));

        AdapterKukubi adapterKukubi = new AdapterKukubi(GameKukubiScreenPlay.this, R.layout.activity_game_kukubi_screen_play, arr);

        gv.setAdapter(adapterKukubi);

        tv_score.setText(Integer.toString(score));
    }

    private void setOnClick()
    {
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == GameKukubiHelper.answer)
                {
                    score++;
                    setDataForGameBoard();

                    if (level % 5 == 0)
                    {
                        rows++;
                        settingGameBoard(rows);
                        setDataForGameBoard();
                        setOnClick();
                    }
                }
            }
        });
    }
}
