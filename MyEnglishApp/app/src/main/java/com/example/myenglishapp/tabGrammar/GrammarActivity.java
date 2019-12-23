package com.example.myenglishapp.tabGrammar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myenglishapp.R;

public class GrammarActivity extends AppCompatActivity {


    TextView tvTitle1,tvTitle2,tvTitle3,tvTitle4,tvTitle5,tvTitle6,tvNoiDung1,tvNoiDung2,tvNoiDung3,tvNoiDung4,tvNoiDung5,tvNoiDung6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammar);
        tvTitle1 = (TextView)findViewById(R.id.textViewTitle1);
        tvTitle2 = (TextView)findViewById(R.id.textViewTitle2);
        tvTitle3 = (TextView)findViewById(R.id.textViewTitle3);
        tvTitle4 = (TextView)findViewById(R.id.textViewTitle4);
        tvTitle5 = (TextView)findViewById(R.id.textViewTitle5);
        tvTitle6 = (TextView)findViewById(R.id.textViewTitle6);
        tvNoiDung1=(TextView)findViewById(R.id.textViewNoiDung1);
        tvNoiDung2=(TextView)findViewById(R.id.textViewNoiDung2);
        tvNoiDung3=(TextView)findViewById(R.id.textViewNoiDung3);
        tvNoiDung4=(TextView)findViewById(R.id.textViewNoiDung4);
        tvNoiDung5=(TextView)findViewById(R.id.textViewNoiDung5);
        tvNoiDung6=(TextView)findViewById(R.id.textViewNoiDung6);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("idGrammar");
        int _id = bundle.getInt("id");
        String ten = bundle.getString("ten");

        //hiện tiêu đề;
        ActionBar ab = getSupportActionBar();
        //set mầu cho actionBar
        ab.setTitle(ten);

        //Hiện nút back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvTitle1.setText(bundle.getString("title1"));
        tvNoiDung1.setText(bundle.getString("noidung1"));
        tvTitle2.setText(bundle.getString("title2"));
        tvNoiDung2.setText(bundle.getString("noidung2"));
        tvTitle3.setText(bundle.getString("title3"));
        tvNoiDung3.setText(bundle.getString("noidung3"));
        tvTitle4.setText(bundle.getString("title4"));
        tvNoiDung4.setText(bundle.getString("noidung4"));
        tvTitle5.setText(bundle.getString("title5"));
        tvNoiDung5.setText(bundle.getString("noidung5"));
        tvTitle6.setText(bundle.getString("title6"));
        tvNoiDung6.setText(bundle.getString("noidung6"));

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
