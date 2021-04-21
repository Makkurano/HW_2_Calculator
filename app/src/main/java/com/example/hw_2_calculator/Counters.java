package com.example.hw_2_calculator;

public class Counters {
    private int inter1;
    private int inter2;

    public Counters(){
        inter1 = 0;
        inter2 = 0;
    }

    public int getCounter1() {
        return inter1;
    }

    public int getInter2() {
        return inter2;
    }

    public void incrementCounter1(){
        inter1++;
    }

    public void incrementCounter2(){
        inter2++;
    }
}
