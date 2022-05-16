package com.ankush._5_Recursion.RecursionWithPattern;

import java.util.Arrays;

public class BubbleSort_Recursion {
    public static void main(String[] args) {
            int []arr={4,3,2,1};
            newtriangle2(arr, arr.length-1,0);
            System.out.print(Arrays.toString(arr));
    }

    static void newtriangle2(int[] arr,int r ,int c) {
        if (r == 0) return;

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            newtriangle2(arr, r, c + 1);

        } else {
            newtriangle2(arr, r - 1, 0);


        }
    }
}
