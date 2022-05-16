package com.ankush._7_Searching.Questions;
///https://leetcode.com/problems/find-in-mountain-array/
// HARD level Question
public class SearchInMountain_Array {

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 170 ,160 ,140 ,130 ,100 ,90};//90, 100, 130, 140, 160, 170};
        // Search in Mountain array

        // first find peak index
        System.out.println(peak(arr));
        System.out.print(SeachinMountainArray(arr,5));

    }

    static int SeachinMountainArray(int []arr , int target)
    {
        int peakindex = peak(arr);
        int leftsearcch = binarySearchINC(arr,target,0,peakindex);
       int rightseach = binarySearchDESC(arr,target,peakindex+1,arr.length);


       System.out.println("Leftpart "+leftsearcch);
       System.out.println("Rightpart "+rightseach);
        if(leftsearcch != -1)
        {
            return leftsearcch;
        }
    return rightseach;
    }

    static int peak(int []arr)
    {
        int start =0 ,end =arr.length-1;

        while(start < end)
        {
            int mid= start + (end - start )/2;

            if(arr[mid] > arr[mid+1])
            {
                // you are in decrease array
                end=mid;
            }else {
                start=mid+1;
            }

        }
        return start;
    }

    static  int binarySearchINC(int []arr,int target , int start ,int end)
    {
        while(start <= end)
        {
            int mid = start+ (end-start) /2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target)
            {
                return binarySearchINC(arr,target,mid+1,end);
            }
            if(arr[mid] > target)
            {
               return   binarySearchINC(arr, target,start,mid-1);
            }
        }
    return -1;
    }


    static  int binarySearchDESC(int []arr,int target , int start ,int end)
    {
        while(start <= end)
        {
            int mid = start+ (end-start) /2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target)
            {
                return binarySearchINC(arr,target,mid+1,end);
            }
            if(arr[mid] < target)
            {
                return   binarySearchINC(arr, target,start,mid-1);
            }
        }
        return -1;
    }
}
