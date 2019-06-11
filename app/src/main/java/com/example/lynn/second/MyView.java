package com.example.lynn.second;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.lynn.second.MainActivity.*;

public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);

        word = getWord();

        String temp = scramble(word);

        buttons = new Button[word.length()];


    }

}
