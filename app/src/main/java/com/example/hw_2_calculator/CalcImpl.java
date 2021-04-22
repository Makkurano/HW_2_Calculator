package com.example.hw_2_calculator;

public class CalcImpl implements Operations {

    @Override
    public double operations(double argOne, double argTwo, OperationsEnum operation) {
        switch (operation) {
            case PLUS:
                return argOne + argTwo;
            case MINUS:
                return argOne - argTwo;
            case DEVISION:
                return argOne / argTwo;
            case MULTIPLICATION:
                return argOne * argTwo;
        }
        return 0;
    }
}
