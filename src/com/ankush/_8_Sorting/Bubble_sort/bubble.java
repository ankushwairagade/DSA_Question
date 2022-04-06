package com.ankush._8_Sorting.Bubble_sort;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {66, -65, 2, 5, 8, 5, 9, 4};
        sortAsc(arr);

        System.out.println(Arrays.toString(arr));
        sortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sortAsc(int []arr) // complexity of Bubble sort is T(n)= 0(n^2)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    static void sortDesc(int [] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] > arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
