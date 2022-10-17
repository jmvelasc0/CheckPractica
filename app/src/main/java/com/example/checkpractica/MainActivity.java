package com.example.checkpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int n = 0;

    EditText et;
    ArrayList<CheckBox> ach = new ArrayList<>();

    private LinearLayout ln = (LinearLayout) findViewById(R.id.ln);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encuesta);

        et = (EditText) findViewById(R.id.txt);

        ach.add((CheckBox) findViewById(R.id.checkBox));
        ach.add((CheckBox) findViewById(R.id.checkBox));
        ach.add((CheckBox) findViewById(R.id.checkBox));
        ach.add((CheckBox) findViewById(R.id.checkBox));
    }

    public void touch(LinearLayout ln){
        for (int i = 0; i < ach.size(); i++) {
            if (ach.get(i).isChecked()) {
                n++;
            }
        }
        et.setText("Numero de deportes que practica: "+n);
    }
}