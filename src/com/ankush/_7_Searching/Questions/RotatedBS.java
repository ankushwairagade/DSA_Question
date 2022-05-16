package com.ankush._7_Searching.Questions;

public class RotatedBS {
    public static void main(String[] args) {
            int []arr= {5,6,7,8,9,1,2};
            System.out.println(findMaxElement(arr));
    }


    static int findMaxElement(int []arr)
    {
        int start = 0 , end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(  mid < end && arr[mid] > arr[mid+1]) return mid;
            if( mid > start && arr[mid-1] > arr[mid]) return mid-1;

            if(arr[start] > arr[mid])
            {
                end =mid-1;
            }else{
            start = mid+1;
            }
        }
        return -1;

    }

    // find max element in array with rotated array
    // then apply Binary search for  0 max   , max+1 arr.length
    // find element that you want

    // there are four cases
    // two are overlapping eachother's    + -

    // if(arr[start] >arr[end]) end = mid-1 ; else start = mid+1;

}
