package com.ankush._3_Mathematics.Maths_code;

public class PerfectSquareRoot {

    public static void main(String[] args) {

        int n=40;


       System.out.print(findsquareroot(n,3));
    }

    private static double findsquareroot(int n , int p) {

        int s=0 , e = n+1;
        double root=0.0;
        while(s<=e)
        {
         int mid = s + (e-s) /2;

         if(mid * mid == n) return mid;

         if(mid * mid > n) e=mid-1;

         if(mid * mid< n) s=mid+1;
        }

        double inc=0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <= n)
            {
                root += inc;

            }
            root -= inc;
            inc/=10;
        }



        return root;
    }


}