package com.example.myenglishapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class GameKukubiHelper {
    String mau[] = new String[] { "#800080", "#ff93ff", "#ff0000", "#d82020", "#DF01D7"};
    Random random = new Random();

    static int answer;

    // tạo màu cho ô
    public ArrayList<String> createColor(int n)
    {
        ArrayList<String> result = new ArrayList<>();

        // random vị trí màu khác biệt
        int indexDef = random.nextInt(n);
        answer = indexDef;

        // random màu khác biệt
        int colorDef = random.nextInt(mau.length);

        // random màu giống nhau
        int colorCom;
        do {
            colorCom = random.nextInt(mau.length);
        }
        while (colorDef == colorCom);


        // thêm mã màu vào list
        for (int i =0; i < n; i++)
        {
            if (i == indexDef)
            {
                result.add(mau[colorDef]);
            }
            else
            {
                result.add(mau[colorCom]);
            }
        }

        return result;
    }
}
