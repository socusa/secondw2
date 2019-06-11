package com.example.lynn.second;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.View.VISIBLE;
import static com.example.lynn.second.MainActivity.*;

public class MyListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Button source = (Button)v;

        if (first == null)
            first = source;
        else {
            Button second = source;

            String temp = first.getText().toString();
            first.setText(second.getText());
            second.setText(temp);

            String candidate = "";

            for(int counter=0;counter<buttons.length;counter++)
                candidate += buttons[counter].getText();

            if (candidate.equals(word)) {
                Toast toast = Toast.makeText(source.getContext(),"You got it",Toast.LENGTH_LONG);

                toast.show();

                button.setVisibility(VISIBLE);

                button.setY(400);

                ObjectAnimator animation1 = ObjectAnimator.ofFloat(button,"scaleX",1,2,4,8,4,16,1);

                animation1.start();
            }
        }

    }
}
