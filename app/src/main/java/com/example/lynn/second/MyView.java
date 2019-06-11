package com.example.lynn.second;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.lynn.second.MainActivity.*;

public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);

        word = getWord();

        word = word.toUpperCase();

        String temp = scramble(word);

        buttons = new Button[word.length()];

        for(int counter=0;counter<buttons.length;counter++) {
            buttons[counter] = new Button(context);

            buttons[counter].setText(temp.substring(counter,counter+1));

            buttons[counter].setTextSize(20);

            buttons[counter].setOnClickListener(listener);

            addView(buttons[counter]);
        }

        button = new Button(context);

        button.setText("You got it");

        button.setVisibility(INVISIBLE);

        addView(button);


    }

}
