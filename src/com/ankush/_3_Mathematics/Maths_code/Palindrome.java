package com.ankush._3_Mathematics.Maths_code;

public class Palindrome {
    // 121 is palindrome number

    public static void main(String[] args) {


    }


    int check(int n)
    {   int sum=0;
        while(n>0)
        {
            int rem=n%10;
            n/=10;
            sum+=rem;
        }

        return sum;
    }
}
