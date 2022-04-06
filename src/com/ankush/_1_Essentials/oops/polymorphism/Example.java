package com.ankush._1_Essentials.oops.polymorphism;

public class Example {
    // polymorphism ability to take different forms

    public static void main(String[] args) {
        int a=10,b=20,c=30;
        System.out.println(fun(a,b));
        System.out.println(fun(a,b,c));
    }

    static int fun(int a, int b)
    {
        return a+b;
    }
    static int fun(int a, int b ,int c)
    {
        return a+b+c;
    }

}
