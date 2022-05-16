package com.ankush._5_Recursion.Level_3_With_searchNsorting;

public class BinarySearch {
    public static void main(String[] args) {

        int []arr={2,5,8,9,12,15,17,19,26,28,30,39};
        System.out.println(binary(arr,0, arr.length-1,39));
    }

    static int binary(int [] arr , int start ,int end, int target)
    {
        if(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;

            if(target < arr[mid]) return binary(arr,start,mid-1,target);

            if(target > arr[mid]) return  binary(arr,mid+1,end,target);

        }


        return -1;
    }
}
