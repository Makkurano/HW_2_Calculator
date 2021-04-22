package com.example.hw_2_calculator;

public class Inters {
    private int inter1;
    private int inter2;
    private int interFull1;
    private int interFull2;

    public Inters(){
        inter1 = 0;
        inter2 = 0;
    }

    public int getInter1() {
        return interFull1;
    }

    public int getInter2() {
        return inter2;
    }

    public void incrementInter1(){
            inter1 = inter1 + 1;
    }

    public void incrementInter2(){
        inter2++;
    }
}
