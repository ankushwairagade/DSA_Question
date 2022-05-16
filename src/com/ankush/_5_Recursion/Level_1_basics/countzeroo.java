package com.ankush._5_Recursion.Level_1_basics;

public class countzeroo {
    // n = 30204   return 2;

    public static void main(String[] args) {
        System.out.println(count(30204,0));
    }

    static int count(int n,int c)
    {
        if(n==0) return c;

        if(n%10 == 0) c++;

        return count(n/10,c);
    }
}
