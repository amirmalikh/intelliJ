package com.amir;

public class Runner2 {
    public static void main(String[] args) {
        double g = 6.67e-11;
        double m1 = 2;
        double m2 = 5;
        double r = 7;

        double result = (g * ((m1 * m2) / Math.pow(r, 2)));

        System.out.println(result);

    }
}
