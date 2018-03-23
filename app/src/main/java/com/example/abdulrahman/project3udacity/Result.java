package com.example.abdulrahman.project3udacity;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Abdulrahman on 23/03/18.
 */

public class Result extends DialogFragment implements View.OnClickListener{
    String name;
    int Score;
    int correctAnswers;
    int incorrectAnswers;

    public void Results(String name, int score, int correctAnswers, int incorrectAnswers) {
        this.name = name;
        Score = score;
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.dialog,container,false);
        TextView name=(TextView) view.findViewById(R.id.name_user);
        TextView Score=(TextView) view.findViewById(R.id.score);
        TextView correct=(TextView) view.findViewById(R.id.correct);
        TextView incroce=(TextView) view.findViewById(R.id.incorrect);
        name.setText(this.name);
        Score.setText(this.Score+"");
        correct.setText(correctAnswers+"");
        incroce.setText(incorrectAnswers+"");
        Button button=(Button) view.findViewById(R.id.done);
        button.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        this.dismiss();
    }
}
