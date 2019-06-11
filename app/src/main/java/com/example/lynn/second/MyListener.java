package com.example.lynn.second;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
            }
        }

    }
}
