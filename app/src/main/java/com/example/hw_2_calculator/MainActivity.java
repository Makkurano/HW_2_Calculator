package com.example.hw_2_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    float argOne, argTwo;
    boolean plus, minus, multiplication, division, result;
    private final int[] numberButtonIds = new int[]{R.id.button_0, R.id.button_1, R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8, R.id.button_9};

    EditText editText;

    private void setNumberButtonListeners() {
        for (int i = 0; i < numberButtonIds.length; i++) {
            int index = i;
            findViewById(numberButtonIds[i]).setOnClickListener(v -> {
                if ((editText.getText().toString().equals("0")) | (result)) {
                    editText.setText("");
                    editText.setText(editText.getText() + String.valueOf(index));
                    result = false;
                } else {
                    editText.setText(editText.getText() + String.valueOf(index));
                }
            });
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNumberButtonListeners();

        Button buttonDot = findViewById(R.id.button_dot);
        Button buttonMinus = findViewById(R.id.button_minus);
        Button buttonPlus = findViewById(R.id.button_plus);
        Button buttonMultiplication = findViewById(R.id.button_multiplication);
        Button buttonDivision = findViewById(R.id.button_division);
        Button buttonEquals = findViewById(R.id.button_equals);
        Button buttonClean = findViewById(R.id.button_clean);
        editText = (EditText) findViewById(R.id.calculator_monitor);
        Button settings = findViewById(R.id.settings_button);

        Intent nightMode = new Intent(MainActivity.this, SecondActivity.class);
        settings.setOnClickListener(v -> {
            startActivity(nightMode);
        });

        buttonPlus.setOnClickListener(v -> {
            argOne = Float.parseFloat(String.valueOf(editText.getText()));
            plus = true;
            editText.setText("0");
        });

        buttonMinus.setOnClickListener(v -> {
            argOne = Float.parseFloat(String.valueOf(editText.getText()));
            minus = true;
            editText.setText("0");
        });

        buttonMultiplication.setOnClickListener(v -> {
            argOne = Float.parseFloat(String.valueOf(editText.getText()));
            multiplication = true;
            editText.setText("0");
        });

        buttonDivision.setOnClickListener(v -> {
            argOne = Float.parseFloat(String.valueOf(editText.getText()));
            division = true;
            editText.setText("0");
        });

        buttonEquals.setOnClickListener(v -> {
            argTwo = Float.parseFloat(String.valueOf(editText.getText()));

            if (plus) {
                editText.setText(String.format("%s", argOne + argTwo));
                result = true;
                plus = false;
            }

            if (minus) {
                editText.setText(MessageFormat.format("{0}", argOne - argTwo));
                result = true;
                minus = false;
            }

            if (multiplication) {
                editText.setText(argOne * argTwo + "");
                result = true;
                multiplication = false;
            }

            if (division) {
                editText.setText(String.format("%s", argOne / argTwo));
                result = true;
                division = false;
            }
        });

        buttonClean.setOnClickListener(v -> editText.setText("0"));

        buttonDot.setOnClickListener(v -> editText.setText(editText.getText() + "."));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}

