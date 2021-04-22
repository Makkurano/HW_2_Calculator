package com.example.hw_2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Inters inters;
    private TextView textMonitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inters = new Inters();
        initView();
    }
    private void initView() {
        textMonitor = findViewById(R.id.calculator_monitor);
        initButton2ClickListener();
    }

    private void initButton2ClickListener() {

        Button button0 = findViewById(R.id.button_0);
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMultiplication = findViewById(R.id.button_multiplication);
        Button buttonDivision = findViewById(R.id.button_division);
        Button buttonEquals = findViewById(R.id.button_equals);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inters.incrementInter1();
                setTextCounter(textMonitor, inters.getInter1());
            }
        });
    }

    private void setTextCounter(TextView textMonitor, int inter){
        textMonitor.setText(String.format(Locale.getDefault(), "%d", inter));
    }
}

