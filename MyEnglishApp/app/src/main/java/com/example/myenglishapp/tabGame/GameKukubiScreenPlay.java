package com.example.myenglishapp.tabGame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myenglishapp.Question;
import com.example.myenglishapp.QuizDbHelper;
import com.example.myenglishapp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class GameKukubiScreenPlay extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Duy");


    TextView tv_time;
    TextView tv_score;
    GridView gv;
    GameKukubiHelper helper = new GameKukubiHelper();
    GameKukubiConstants constants = new GameKukubiConstants();
    ArrayList<Question> questionList;
    ArrayList<QuestionG> listQues;
    ArrayList arr;
    Random random;


    int level;
    int music;
    int rows;
    int score;
    int bestScore;
    int time;

    CountDownTimer tm;
    TextToSpeech textToSpeech;
    MediaPlayer mediaPlayer;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_kukubi_screen_play);

        // Ẩn action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        // Tạo luồng lấy data từ firebase
        getQuestionsFromFirebase();

        // Lấy dữ liệu được truyển sang
        Intent intent = getIntent();
        level = intent.getIntExtra("level", 0);
        music = intent.getIntExtra("music", 0);

        if (music == 1)
        {
            mediaPlayer = MediaPlayer.create(this, R.raw.song);
            mediaPlayer.start();
        }


        if (level == 0)
        {
            time = constants.timeLevel0;
        }
        else if (level == 1)
        {
            time = constants.timeLevel1;
        }
        else
        {
            time = constants.timeLevel2;
        }

        score = constants.scoreDefault;
        rows = constants.rowsDefault;

        mapping();
        settingGameBoard(rows);
        setDataForGameBoard();
        setCountDownTime();
        tm.start();
        setOnClick();


    }

    private void mapping()
    {
        tv_time = (TextView) findViewById(R.id.tvTime);
        tv_score = (TextView) findViewById(R.id.tvScore);
        gv = (GridView) findViewById(R.id.game_board);

        dialog  = new Dialog(this);
        dialog.setContentView(R.layout.tab_game_losed);
        dialog.setTitle("Answer questions !");
        dialog.setCanceledOnTouchOutside(false);
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

        tv_score.setText("" + score);
    }

    private void setCountDownTime()
    {
        tm = new CountDownTimer(time, 100) {

            public void onTick(long millisUntilFinished) {
                tv_time.setText(millisUntilFinished / 1000+ "," + (millisUntilFinished % 1000) / 100  + " S");

                if (millisUntilFinished < constants.timeDangerous)
                    tv_time.setTextColor(Color.parseColor(constants.textColorDangerous));
                else
                    tv_time.setTextColor(Color.parseColor(constants.textColorDefaule));
            }

            public void onFinish() {
                tv_time.setText("0.0 S");

                showDialogLosed();
                //tm.cancel();
            }
        };
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
                    tm.start();

                    if (score % constants.answersToNextLevel == 0)
                    {
                        if (rows <= constants.rowsMax) rows++;

                        settingGameBoard(rows);
                        setDataForGameBoard();
                        setOnClick();
                    }
                }
                else
                    showDialogLosed();
            }
        });
    }

    private void getQuestionsFromFirebase()
    {
        listQues = new ArrayList<QuestionG>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                myRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        DataSnapshot bestscoreNode = dataSnapshot.child("bestscore");
                        bestScore= Integer.parseInt(bestscoreNode.getValue().toString());

                        for (DataSnapshot data: dataSnapshot.child("questions").getChildren())
                        {
                            QuestionG ques = new QuestionG();
                            ques.setQues(data.getValue(QuestionG.class).getQues());
                            ques.setAns_a(data.getValue(QuestionG.class).getAns_a());
                            ques.setAns_b(data.getValue(QuestionG.class).getAns_b());
                            ques.setAns_c(data.getValue(QuestionG.class).getAns_c());
                            ques.setAns_d(data.getValue(QuestionG.class).getAns_d());
                            ques.setAns_true(data.getValue(QuestionG.class).getAns_true());

                            listQues.add(ques);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        }).start();
    }

    private void showDialogLosed()
    {
        if (mediaPlayer != null) mediaPlayer.pause();
        tm.cancel();



        if (!isConnected(this))
        {
            showDiaLogLosedNoInternet();
            return;
        }

        // ánh xạ
        Button btn_speak = (Button) dialog.findViewById(R.id.btn_speak);
        TextView tv_ques = (TextView) dialog.findViewById(R.id.tv_question);
        Button btn_ans_a = (Button) dialog.findViewById(R.id.btn_answer_a);
        Button btn_ans_b = (Button) dialog.findViewById(R.id.btn_answer_b);
        Button btn_ans_c = (Button) dialog.findViewById(R.id.btn_answer_c);
        Button btn_ans_d = (Button) dialog.findViewById(R.id.btn_answer_d);

        // set data
        random = new Random();
        int index = random.nextInt(listQues.size());
        QuestionG ques = listQues.get(index);
        final String quesion = ques.getQues();
        final String ans_a = ques.getAns_a();
        final String ans_b = ques.getAns_b();
        final String ans_c = ques.getAns_c();
        final String ans_d = ques.getAns_d();
        final String ans_true = ques.getAns_true();

        tv_ques.setText(quesion);
        btn_ans_a.setText(ans_a);
        btn_ans_b.setText(ans_b);
        btn_ans_c.setText(ans_c);
        btn_ans_d.setText(ans_d);

        // add event

        btn_speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(GameKukubiScreenPlay.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status != TextToSpeech.ERROR)
                        {
                            textToSpeech.setLanguage(Locale.ENGLISH);
                            textToSpeech.speak(quesion, TextToSpeech.QUEUE_FLUSH, null);
                        }
                    }
                });
            }
        });

        btn_ans_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans_a.equals(ans_true))
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's correct", Toast.LENGTH_SHORT).show();
                    setDataForGameBoard();
                    if (mediaPlayer != null && !mediaPlayer.isPlaying() ) mediaPlayer.start();
                    tm.start();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's incorrect. GAME OVER !!!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    gameOver();
                }

            }
        });

        btn_ans_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans_b.equals(ans_true))
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's correct", Toast.LENGTH_SHORT).show();
                    setDataForGameBoard();
                    if (mediaPlayer != null && !mediaPlayer.isPlaying() ) mediaPlayer.start();
                    tm.start();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's incorrect. GAME OVER !!!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    gameOver();
                }

            }
        });

        btn_ans_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans_c.equals(ans_true))
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's correct", Toast.LENGTH_SHORT).show();
                    setDataForGameBoard();
                    if (mediaPlayer != null && !mediaPlayer.isPlaying() ) mediaPlayer.start();
                    tm.start();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's incorrect. GAME OVER !!!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    gameOver();
                }

            }
        });

        btn_ans_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans_d.equals(ans_true))
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's correct", Toast.LENGTH_SHORT).show();
                    setDataForGameBoard();
                    if (mediaPlayer != null && !mediaPlayer.isPlaying() ) mediaPlayer.start();
                    tm.start();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's incorrect. GAME OVER !!!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    gameOver();
                }

            }
        });

        dialog.show();
    }

    private void gameOver()
    {
        if (bestScore < Integer.parseInt(tv_score.getText().toString()))
        {
            myRef.child("bestscore").setValue(score);
        }
        if (mediaPlayer != null)
        {
            mediaPlayer.release();
            mediaPlayer = null;
        }

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Bạn giành được " + score)
                .setTitle("Bạn trả lời sai rồi !!!")
                .setPositiveButton(R.string.btn_ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).show();
    }

    @Override
    public void onBackPressed() {

        if (mediaPlayer != null) mediaPlayer.pause();
        tm.cancel();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.back_game)
                .setPositiveButton(R.string.btn_cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (mediaPlayer != null) mediaPlayer.pause();
                        tm.start();
                    }
                })
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
        ;

        builder.show();
    }

    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
            else
                return false;
        }
        else
            return false;
    }

    private void showDiaLogLosedNoInternet()
    {
        QuizDbHelper dbHelper = QuizDbHelper.getInstance(this);
        questionList = dbHelper.getQuestions(1, "Easy");

        random = new Random();
        int index = random.nextInt(questionList.size());
        Question ques = questionList.get(index);

        final String quesion = ques.getQuestion();
        final String ans_b = ques.getOption1();
        final String ans_c = ques.getOption2();
        final String ans_d = ques.getOption3();
        final String ans_true;

        if ( ques.getAnswerNr() == 1)
            ans_true = ques.getOption1();
        else if (ques.getAnswerNr() == 2)
            ans_true = ques.getOption2();
        else
            ans_true = ques.getOption3();

        // ánh xạ
        Button btn_speak = (Button) dialog.findViewById(R.id.btn_speak);
        TextView tv_ques = (TextView) dialog.findViewById(R.id.tv_question);
        Button btn_ans_a = (Button) dialog.findViewById(R.id.btn_answer_a);
        Button btn_ans_b = (Button) dialog.findViewById(R.id.btn_answer_b);
        Button btn_ans_c = (Button) dialog.findViewById(R.id.btn_answer_c);
        Button btn_ans_d = (Button) dialog.findViewById(R.id.btn_answer_d);

        tv_ques.setText(quesion);
        btn_ans_a.setVisibility(View.INVISIBLE);
        btn_ans_b.setText(ans_b);
        btn_ans_c.setText(ans_c);
        btn_ans_d.setText(ans_d);

        // add event

        btn_speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech = new TextToSpeech(GameKukubiScreenPlay.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status != TextToSpeech.ERROR)
                        {
                            textToSpeech.setLanguage(Locale.ENGLISH);
                            textToSpeech.speak(quesion, TextToSpeech.QUEUE_FLUSH, null);
                        }
                    }
                });
            }
        });

        btn_ans_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans_b.equals(ans_true))
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's correct", Toast.LENGTH_SHORT).show();
                    setDataForGameBoard();
                    if (mediaPlayer != null && !mediaPlayer.isPlaying() ) mediaPlayer.start();
                    tm.start();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's incorrect. GAME OVER !!!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    gameOver();
                }

            }
        });

        btn_ans_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans_c.equals(ans_true))
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's correct", Toast.LENGTH_SHORT).show();
                    setDataForGameBoard();
                    if (mediaPlayer != null && !mediaPlayer.isPlaying() ) mediaPlayer.start();
                    tm.start();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's incorrect. GAME OVER !!!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    gameOver();
                }

            }
        });

        btn_ans_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ans_d.equals(ans_true))
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's correct", Toast.LENGTH_SHORT).show();
                    setDataForGameBoard();
                    if (mediaPlayer != null && !mediaPlayer.isPlaying() ) mediaPlayer.start();
                    tm.start();
                    dialog.dismiss();
                }
                else
                {
                    Toast.makeText(GameKukubiScreenPlay.this,"It's incorrect. GAME OVER !!!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    gameOver();
                }

            }
        });

        dialog.show();
    }
}
