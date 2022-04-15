package com.Bridgelabz;

public class Prob001 {
    public static void main(String[] args) {
//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
        int num = 5, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
