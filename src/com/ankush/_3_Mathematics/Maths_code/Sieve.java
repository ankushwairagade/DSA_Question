package com.ankush._3_Mathematics.Maths_code;

public class Sieve {
    public static void main(String[] args) {

        int n=50;
        boolean [] primes = new boolean[n+1];  // by default false

        // if boolean is false then it is prime number

        sieve(n,primes);


    }


    static void sieve(int n, boolean[] primes)
    {

        for (int i = 2; i*i <=n ; i++) {

            if(!primes[i])
            {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j]=true;
                }
            }
        }


        for (int i = 0; i < primes.length; i++) {
            if(!primes[i])
            {
                System.out.println(i);
            }
        }

    }
}
