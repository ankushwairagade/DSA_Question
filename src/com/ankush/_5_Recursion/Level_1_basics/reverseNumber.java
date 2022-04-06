package com.ankush._5_Recursion.Level_1_basics;

public class reverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(512));
    }

    static int reverse(int n)
    {
        return check(n,(int) Math.log10(n));
    }

    static int check(int n , int digit)
    {
        if(n==0) return 0;

        return n%10 * (int) Math.pow(10,digit) + check(n/10,digit-1) ;

        // 8 * 10^3 + 5 * 10^2 + 1 * 10^1
    }
}
