package com.example.abdulrahman.project3udacity;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctAnswers=0;
    int inCorrectAnswers=0;
    CheckBox java;
    CheckBox Ccharp;
    RadioGroup Q2;
    RadioGroup Q3;
    RadioGroup Q4;
    RadioGroup Q5;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java=(CheckBox) findViewById(R.id.java);
        Ccharp=(CheckBox) findViewById(R.id.Csharp);
        Q2=(RadioGroup) findViewById(R.id.Q2_answer);
        Q3=(RadioGroup) findViewById(R.id.Q3_answer);
        Q4=(RadioGroup) findViewById(R.id.Q4_answer);
        Q5=(RadioGroup) findViewById(R.id.Q5_answer);
        name=(EditText) findViewById(R.id.name);

    }

    public void butSubnit(View view) {
        if (java.isChecked()&& Ccharp.isChecked()){
            correctAnswers++;
        }
        else {
            inCorrectAnswers++;
        }
        int Q2Answer=Q2.getCheckedRadioButtonId();
        if(Q2Answer==R.id.parice){
            correctAnswers++;
        }
        else {
            inCorrectAnswers++;
        }
        int Q3Answer=Q3.getCheckedRadioButtonId();
        if(Q3Answer==R.id.DiphuAssam){
            correctAnswers++;
        }
        else {
            inCorrectAnswers++;
        }
        int Q4Answer=Q4.getCheckedRadioButtonId();
        if(Q4Answer==R.id.an1){
            correctAnswers++;
        }
        else {
            inCorrectAnswers++;
        }
        int Q5Answer=Q5.getCheckedRadioButtonId();
        if(Q5Answer==R.id.Rome){
            correctAnswers++;
        }
        else {
            inCorrectAnswers++;
        }

        FragmentManager fragmentManager=getFragmentManager();
        Result result=new Result();
        result.Results(name.getText().toString(),correctAnswers,correctAnswers,inCorrectAnswers);
        result.show(fragmentManager,"RUN");

        correctAnswers=0;
        inCorrectAnswers=0;
    }
}
