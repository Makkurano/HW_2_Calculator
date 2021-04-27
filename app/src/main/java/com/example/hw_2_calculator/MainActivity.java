package com.example.hw_2_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float argOne, argTwo;
    boolean plus, minus, multiplication, division;
    private final int[] numberButtonIds = new int[]{R.id.button_0, R.id.button_1, R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8, R.id.button_9};

    EditText editText;

    private void setNumberButtonListeners() {
        for (int i = 0; i < numberButtonIds.length; i++) {
            int index = i;
            findViewById(numberButtonIds[i]).setOnClickListener(v -> editText.setText(editText.getText() + String.valueOf(index)));
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



        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    argOne = Float.parseFloat(String.valueOf(editText.getText()));
                    plus = true;
                    editText.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                argOne = Float.parseFloat(String.valueOf(editText.getText()));
                minus = true;
                editText.setText(null);
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                argOne = Float.parseFloat(String.valueOf(editText.getText()));
                multiplication = true;
                editText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                argOne = Float.parseFloat(String.valueOf(editText.getText()));
                division = true;
                editText.setText(null);
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                argTwo = Float.parseFloat(String.valueOf(editText.getText()));

                if (plus) {
                    editText.setText(argOne + argTwo + "");
                    plus = false;
                }

                if (minus) {
                    editText.setText(argOne - argTwo + "");
                    minus = false;
                }

                if (multiplication) {
                    editText.setText(argOne * argTwo + "");
                    multiplication = false;
                }

                if (division) {
                    editText.setText(argOne / argTwo + "");
                    division = false;
                }
            }
        });

        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
}

