package com.ankush._7_Searching.Questions;

import java.util.Arrays;

// Facebook Interview Question
public class FirstandLastposinArray {
    //  [5,7,7,8,8,10]  target =8;
    //  o/p = [3,4]

    public static void main(String[] args) {
        int arr[] = {5,7,7,7,8,10};
        System.out.println(Arrays.toString(FirstNLast(arr, 7)));
    }

   static int[] FirstNLast(int[] arr , int target) {

       int [] ans ={-1,-1};
        int start=binarySearch(arr,target,true);
        int end=binarySearch(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static int binarySearch(int []arr , int target , boolean FirstIndex)
    {
        int start = 0 , end = arr.length-1 , ans =-1;

        while(start <= end)
        {
            int mid = start + ( end-start) /2;

           // if(arr[mid] == target) return mid;

            if(arr[mid] < target)
               start=mid+1;
            else if(arr[mid] > target)
                end= mid-1;
             else{
               ans =mid;
                if(FirstIndex)
                {
                    end=mid-1;
                }else {
                    start=mid+1;
                }


            }
        }

        return ans;
    }
}
