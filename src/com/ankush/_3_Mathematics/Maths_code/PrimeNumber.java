package com.ankush._3_Mathematics.Maths_code;

public class PrimeNumber {

    public static void main(String[] args) {

         // T(n) = 0( n * sqrt(n))

        for (int i = 0; i < 101; i++) {
            if(check(i))
            {
                System.out.println(i);
            }
        }
    }

    static boolean check(int n)  // t(n) = 0 sqrt(n)
    {
        for (int i = 2; i < n; i*=i) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
