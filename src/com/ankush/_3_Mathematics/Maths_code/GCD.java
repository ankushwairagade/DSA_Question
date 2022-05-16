package com.ankush._3_Mathematics.Maths_code;

public class GCD {
    public static void main(String[] args) {

        System.out.println(lcm1(9,18));
    }

    static int gcd(int a, int b)
    {
        if( b==0) return a;
        return  gcd(b ,a%b);
    }

    static int lcm (int a , int b)
    {
        int d =gcd(a,b);
        int f = a/d;
        int g = b/d;
        return  f*g*d;
    }
    static int lcm1 (int a ,int b)
    {
        return  a*b/gcd(a,b);
    }
}
