package com.DSA_v2._0_Basic;

public class Reverse {

    // n = 2345  ans 5432

    //  5*10 + 4 = 54
    // 54*10 + 3 = 345

    public static void main(String[] args) {

        int n = 2345;
        int ans = 0;

        while (n > 0) {

            int temp = n%10;
           ans = ans*10 + temp;
            n/=10;
        }
        System.out.println("value "+ans);
    }
}
