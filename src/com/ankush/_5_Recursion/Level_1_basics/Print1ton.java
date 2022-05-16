package com.ankush._5_Recursion.Level_1_basics;

public class Print1ton {

    public static void main(String[] args) {
        fun(5,0);
    }

    static int fun(int n,int i)  // 0  to N  using recursion
    {
        if(n==i){
            System.out.println(i);
            return n;
        }
        System.out.println(i);
        return fun(n,i+1);
    }
}
