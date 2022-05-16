package com.ankush._7_Searching.Questions;

public class RotatedBinaraySearch {
    public static void main(String[] args) {
        int arrrotated[] ={4,5,6,7,8,9,1,2,3};

        System.out.println(searchInRotatedBS(arrrotated,3));

    }
    static int searchInRotatedBS(int[]arr, int target)
    {
        int peakindex=pivot(arr);
        System.out.println(peakindex);
        int leftsearch =BSincr(arr,target,0,peakindex);
        int rightseach =BSincr(arr,target,peakindex+1, arr.length);

        if(leftsearch !=-1) return leftsearch;
    return rightseach;
    }

    static int peak(int []arr)
    {
        int start=0 , end =arr.length-1;
        while(start < end)
        {   int mid =start +(end -start) /2;
            if(arr[mid] >arr[mid+1])
            {   // left side of array
                end =mid;
            }else {
                start =mid+1;
            }
        }
        return start;
    }


    static int pivot(int[]arr)
    {
        int start = 0 , end =arr.length-1;

        while(start <= end)
        {
            int mid =start + (end-start) /2;
            // 4 cases to find pivot

            if(mid < end && arr[mid] > arr[mid+1])
            {return mid;}

            if( mid > start && arr[mid-1] > arr[mid])
            {return mid-1;}

            if(arr[start] >= arr[mid])
            {
                end=mid-1;
            }else {
                start = mid+1;
            }

        }
        return -1;
    }
    static int BSincr(int [] arr , int target , int start , int end)
    {
        while(start <= end)
        {
            int mid  = start + (end -start) / 2;

            if(arr[mid] == target) return mid;

            if(arr[mid] < target)
            {
               return BSincr(arr,target,mid+1,end);
            }
            if(arr[mid] > target)
            {
               return BSincr(arr,target,start,mid-1);
            }
        }
        return -1;
    }



}
