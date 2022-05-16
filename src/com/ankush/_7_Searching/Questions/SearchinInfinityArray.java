package com.ankush._7_Searching.Questions;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// AMAZON QUESTION
// given array is sorted and start with index 0 but we can't used arr.length function to find length

public class SearchinInfinityArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170,200,240,250,400,420,450,470,490,500}; // array length is infinity
        System.out.println(findNumber(arr,140));
    }

    static int findNumber(int[]arr ,int target)
    {
        // so move start and end pointer towards target
        int start=0 ,end =1;

        // Amazon Question and only four line of Code
        while(arr[end] < target)
        {
            int newStart = end + 1;
            end = end + (end -start+ 1) *2;
            start = newStart;
        }
        // then apply binary search
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int [] arr ,int target , int start , int end)
    {
        while(start <= end)
        {
            int mid = start+ (end-start) /2;

            if(arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target)
            {
               return binarySearch(arr,target,mid+1,end);
            }
            if(arr[mid] > target)
            {
              return   binarySearch(arr,target,start,mid-1);
            }

        }
        return -1;
    }
}
