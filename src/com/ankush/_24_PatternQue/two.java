package com.ankush._24_PatternQue;

/*
    2.  *
        **
        ***
        ****
        *****
*/

public class two {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
