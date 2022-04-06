package com.ankush._5_Recursion.Level_1_basics;

public class palindrome {
    // 121  = return 121 palindrome
    // 251 = 152  return not palindrome

    public static void main(String[] args) {

        // 1*100 + 2 *20 + 1 = Math.logbase10 (n)  --> count
        int n=512,digit=(int) Math.log10(n);
        if(n == check(n,digit))
        {
            System.out.print("Palidrome");
        }else{System.out.println("Not Palidrome");}
    }


    static int check(int n , int digit)
    {
        if(n==0) return 0;

        return n%10 * (int) Math.pow(10,digit) + check(n/10,digit-1) ;

        // 8 * 10^3 + 5 * 10^2 + 1 * 10^1
    }
}
