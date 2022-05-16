package com.ankush._7_Searching.BinarySearch;

import java.util.BitSet;

public class binary {

    public static void main(String[] args) {
        // binary search one condition is there array should be sorted

        int [] arr ={2,3,8,10,14,18,19,23,25,29,35,38,45,56,68};

        System.out.print(Binarysearch(arr,6));
    }

    static int Binarysearch(int[] arr, int target) // this soln is Without Recursion
    {
        int start= 0, end =arr.length-1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(target < arr[mid]) {
                end = mid -1;
            }
            if(target >arr[mid]){
                start = mid+1;
            }
        }
        return -1;
    }
}
