package com.ankush._5_Recursion.Level_1_basics;

public class printnto1 {

    public static void main(String[] args) {
        //print  N to 1 or zero
        // fun(n) , fun(n-1) , fun(n-2) .......fun(1)

        fun(5);

    }


    static int fun(int n)
    {
        if(n==1){
            System.out.println(n);
            return 1;
        }

        System.out.println(n);
        return fun(n-1);
    }
}
