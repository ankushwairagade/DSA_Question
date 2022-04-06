package com.ankush._5_Recursion.Level_1_basics;

public class productofdigits {
    public static void main(String[] args) {
        // 5 * 1 * 2 =  return 10
        System.out.println(productSum(5463));
    }

    static int productSum(int n)
    {
        return  helper(n,1);
    }

   static int helper(int n , int rev)
    {
        if(n==0) return rev;
        rev *= n%10;

        return helper(n/10,rev);
    }
}
