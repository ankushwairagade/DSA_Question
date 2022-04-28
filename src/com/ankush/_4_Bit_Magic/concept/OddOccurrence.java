package com.ankush._4_Bit_Magic.concept;

public class OddOccurrence {
    public static void main(String[] args) {
        int []arr={2,3,4,1,2,1,3,6,4};

        System.out.print(oddoccurrence(arr));
    }

    static int oddoccurrence(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum ^=arr[i];
        }

        return sum;
    }
}
