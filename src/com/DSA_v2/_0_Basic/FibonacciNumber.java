package com.DSA_v2._0_Basic;

import java.util.Scanner;

public class FibonacciNumber {

    // idea this  0, 1, 1, 2, 3, 5, 8, 13, .....
    // Questn is find Nth fabonacci number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        Double a = 0.d;
        Double b = 1.d;
        double dummp = 0;
        for (int i = 1; i < num; i++) {
            dummp = a;
            a = a + b;
            b = dummp;
        }
        System.out.println("Fabonacci number of Nth " + num + " value is " + a);
    }
}
