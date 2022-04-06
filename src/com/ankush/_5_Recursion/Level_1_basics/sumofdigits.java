package com.ankush._5_Recursion.Level_1_basics;

public class sumofdigits {
    // 512  = 5 + 1 + 2 = 8

    public static void main(String[] args) {
        System.out.println(helper(51298));
    }

    static int helper(int n)
    {
        return fun(n,0);
    }

    static int fun(int n , int rev)
    {
        if(n==0) return rev;

        rev += n%10;

        return  fun(n/10 ,rev);
    }
}
