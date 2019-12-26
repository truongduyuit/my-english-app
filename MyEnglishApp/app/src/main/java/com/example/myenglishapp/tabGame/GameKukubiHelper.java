package com.example.myenglishapp.tabGame;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

public class GameKukubiHelper {

    Random random = new Random();
    static int answer;

    String mau[] = new String[] { "#DF0101", "#DF3A01", "#DF7401", "#DBA901", "#D7DF01", "#A5DF00", "#74DF00"
        , "#3ADF00", "#01DF01", "#01DF74", "#01DFD7", "#01A9DB", "#013ADF", "#0404B4", "#3104B4", "#7401DF", "#A901DB", "#DF01D7", "#DF01A5", "#DF0174", "#B40431"
    };
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
        int minimum = colorDef - 2  > 0 ? colorDef -2 : colorDef;
        int maximum = colorDef + 2 < mau.length ? colorDef + 2 : colorDef;
        int colorCom;
        do {
            colorCom = ((int) (Math.random()*(maximum - minimum))) + minimum;
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
