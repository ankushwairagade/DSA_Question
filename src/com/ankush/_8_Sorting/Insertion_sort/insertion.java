package com.ankush._8_Sorting.Insertion_sort;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr={11,251,0,55,1-62,14,51,55,15,1,51,5};
        insertionAsc(arr);
        System.out.println("Ascending "+Arrays.toString(arr));
        insertionDesc(arr);
        System.out.println("Desc "+Arrays.toString(arr));
    }


    static void insertionAsc(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }




    static void insertionDesc(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j] > arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
