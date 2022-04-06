package com.ankush._6_Arrays.Questions.SortingAlgo;

public class bubbleSort {
    public static void main(String[] args) {

    }

    static void bubbleSort(int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-2; j++) {

                if(arr[j]<arr[j+1])
                {
                    swap(arr,j,j+1);
                }

            }
        }
    }


    static void swap(int[]arr ,int a ,int b)
    {
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
