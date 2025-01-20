package com.example.demo;

public class AddNumber {
//    public static void main (String args []){
//        int num1;
//        int num2;
//
//    }
    int num1;
    int num2;

    public AddNumber(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    public int  CalculateSum(){
        return num1+num2;
    }
}
