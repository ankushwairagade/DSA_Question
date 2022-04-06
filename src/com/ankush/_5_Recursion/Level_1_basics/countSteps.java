package com.ankush._5_Recursion.Level_1_basics;
 //  https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class countSteps {

    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
    }

    static int numberOfSteps(int nums)
    {
     return helper(nums,0);
    }

    static int helper(int n ,int c)
    {
        if(n==0) return c;

        if( n%2 == 0) {
            // even
            n/=2;
            c+=1;
        }else{
            //odd
            n-=1;
            c+=1;
        }

        return helper(n,c);
    }
}
