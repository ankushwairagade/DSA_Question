package com.DSA_v2._0_Basic;

public class CountingOccurrence {

    /// Quest  n = 1237651767 ; how many time 7 occurrence ??
    public static void main(String[] args) {

        int count = 0;
        int matchDigit = 7;

        int n = 13757879;

        while (n > 0) {
            int temp = n % 10;
            System.out.println("tempo:" + temp);
            count = (temp == matchDigit) ? count + 1 : count;
            n /= 10;
        }

        System.out.println("number of Occurrence is " + count);
    }
}
