package com.ankush._4_Bit_Magic.concept;

public class countsetbit {
    public static void main(String[] args) {
        int count=0;
        int x=11;
        while(x!=0)
        {
            x&=(x-1);
            count++;
        }

        System.out.print(count);
    }
}
