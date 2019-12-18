package com.example.myenglishapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class GameKukubiColorBox extends TextView {


    public GameKukubiColorBox(Context context) {
        super(context);
    }

    public GameKukubiColorBox(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GameKukubiColorBox(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // lấy chiều ngang ô màu
        int ngang = getMeasuredWidth();

        // Set ô vuông
        setMeasuredDimension(ngang, ngang);
    }
}
