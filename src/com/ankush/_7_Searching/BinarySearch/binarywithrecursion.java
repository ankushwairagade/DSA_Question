package com.ankush._7_Searching.BinarySearch;

public class binarywithrecursion {

    public static void main(String[] args) {
        int []arr={2,5,8,12,16,19,20,23,25,27,56};

        System.out.print(Binarysearch(arr,0,arr.length-1,5));
    }


    static int Binarysearch(int[] arr , int start , int end  , int target ) // this sol followed Recursion approch
    {

        while(start <= end)
        {  int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(target < arr[mid]) return Binarysearch(arr,start,mid-1,target);

            if(target > arr[mid]) return Binarysearch(arr,mid+1,end,target);

        }


        return -1;
    }


}
