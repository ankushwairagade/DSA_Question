package com.ankush._4_Bit_Magic.concept;

public class PascalTriangle {
    public static void main(String[] args) {

        // T(n)= 0(n^2)
        /*              int s=0;
        for (int i = 1; i < 20; i++) {
            for (int j = 0; j < i; j++) {
                    s^=j;
            }
            System.out.println(s);
            s=0;
        }*/

            // t(n)= 0(n)
        for (int i = 0; i < 20; i++) {
            System.out.println(Xor(i));
        }

    }

    static int Xor(int a)
    {
        if(a%4 ==0) return a;
        if(a%4 ==1) return 1;
        if(a%4 ==2) return a+1;
        return 0;
    }

    }

