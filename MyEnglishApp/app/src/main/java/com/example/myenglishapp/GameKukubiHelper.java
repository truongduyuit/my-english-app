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
        int indexDef = random.nextInt(mau.length);
        answer = indexDef;

        // random vi tri màu giống nhau
        int indexCom;
        do {
            indexCom = random.nextInt(mau.length);
        }
        while (indexDef == indexCom);


        Log.d("def", "" + indexDef + "/" + indexCom);


        // thêm mã màu vài list
        for (int i =0; i < n; i++)
        {
            if (i == indexDef)
            {
                result.add(mau[indexDef]);
            }
            else
            {
                result.add(mau[indexCom]);
            }

        }

        return result;
    }
}
