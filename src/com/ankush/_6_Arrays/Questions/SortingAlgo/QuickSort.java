package com.ankush._6_Arrays.Questions.SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr={0,158,12,6,5,9,4,120,215,9,9,62,6};
        Qsort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    static void Qsort(int [] arr, int low , int hi)
    {
        if(low>=hi) return;

        int s=low, e= hi, m =s+(e-s)/2;
        int pivot = arr[m];

        while(s<=e)
        {
            while(arr[s]<pivot) {s++;}
            while (arr[e]>pivot){e--;}

            if(s <= e){
                int temp= arr[s];
                arr[s++]=arr[e];
                arr[e--]=temp;

            }
        }

        Qsort(arr,low,e);
        Qsort(arr,s,hi);

    }

}
