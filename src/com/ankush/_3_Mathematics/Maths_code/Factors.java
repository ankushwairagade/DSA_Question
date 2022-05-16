package com.ankush._3_Mathematics.Maths_code;

public class Factors {
    public static void main(String[] args) {
     factor(20);
    }

    static void factor(int n)
    {
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
            {
                System.out.print(i+"    ");
            }
        }
    }
}

