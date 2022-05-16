package com.ankush._5_Recursion.Level_1_basics;

public class productNto1 {
    public static void main(String[] args) {
        //  N = n* n-1 *n-2 * .... *1    or factorial

        System.out.println(factorial(5));
    }

    static int factorial(int n)
    {
        if(n==1)
        {   System.out.print(n+" = ");
            return 1;
        }
        System.out.print(n+"*");
        return n*factorial(n-1);
    }
}
