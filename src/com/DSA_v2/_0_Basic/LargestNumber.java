package com.DSA_v2._0_Basic;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Three number");
        Integer num1 = scanner.nextInt();
        Integer num2 = scanner.nextInt();
        Integer num3 = scanner.nextInt();
        int max = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("largest number is " + max);

        System.out.println("LargestNumber is " + Math.max(Math.max(num1, num2), num3));
    }
}


