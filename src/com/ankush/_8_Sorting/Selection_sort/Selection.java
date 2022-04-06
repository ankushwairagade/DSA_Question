package com.ankush._8_Sorting.Selection_sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {

        int [] arr={3,68,516,2,6,-59,-6,0,2,-18};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }


    // Selection Sort

    static void selectionSort(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {

            int last = arr.length-i-1;
            int max = getmax(arr,0,last);

            int temp= arr[last];
            arr[last] = arr[max];
            arr[max] =temp;
        }
    }

    private static int getmax(int[] arr, int s, int last) {
        int max=s;
        for (int j = 0; j <= last; j++) {
            if(arr[max]<arr[j]) max=j;
        }
        return max;
    }
}
