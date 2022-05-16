package com.ankush._4_Bit_Magic.concept;

public class doublethenumber {
    public static void main(String[] args) {
        int a=10;
            // pure hacked left shift gives double the number
        // General point  a << b = a * 2^b
        for (int i = 0; i < 5; i++) {
            System.out.println(a=a << 1);
        }
    }
}
